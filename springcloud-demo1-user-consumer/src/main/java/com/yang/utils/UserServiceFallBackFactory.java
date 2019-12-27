package com.yang.utils;

import com.yang.model.User;
import com.yang.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public int add(User user) {
                return 0;
            }

            /**
             * 查询方法回退提示
             * @param id
             * @return
             */
            @Override
            public User queryOne(Integer id) {
                User user = new User();
                user.setId(0);
                user.setUsername("远程服务不可用！服务降级");
                return user;
            }
        };
    }
}
