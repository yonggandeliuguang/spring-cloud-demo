package com.yang.pojo;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CustomLoadBalanceRule extends AbstractLoadBalancerRule {


    /**
     * 为客户端初始化参数，可以不用配置
     * @param iClientConfig
     */
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    /**
     * 选中一个服务处理用户请求
     * @param key
     * @return
     */
    @Override
    public Server choose(Object key) {
        //获取负载均衡器操作的接口
        ILoadBalancer lb = getLoadBalancer();
        if (lb==null){
            return null;
        }
        Server server = null;
        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            //获取已经启动，并且可以访问的服务
            List<Server> upList = lb.getReachableServers();
            //获取所有服务,包括可访问的和不可访问的。
            List<Server> allList = lb.getAllServers();

            //获取所有服务的个数
            int serverCount = allList.size();
            System.out.println("服务的个数为"+serverCount);
            if (serverCount == 0) {
                /*
                 * 没有服务，直接结束
                 */
                return null;
            }

            //随机获取一个<=serverCount的数据，也就是随机获取获取所有服务中的下标
            int index = chooseRandomInt(serverCount);
            //根据下标获取可用的服务
            server = upList.get(index);

            if (server == null) {
                /*
                 * 当服务为空的时候，则释放线程锁，重试获取服务操作
                 */
                Thread.yield();
                continue;
            }

            //如果当前服务处于存活状态(也就是服务可调用)，则返回该服务
            if (server.isAlive()) {
                return (server);
            }

            // 如果此时服务已经挂起，则释放服务，并释放锁
            server = null;
            Thread.yield();
        }
        return server;
    }


    /**
     * 获取0<=x<serverCount的随机数
     * @param serverCount
     * @return
     */
    private int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }


}
