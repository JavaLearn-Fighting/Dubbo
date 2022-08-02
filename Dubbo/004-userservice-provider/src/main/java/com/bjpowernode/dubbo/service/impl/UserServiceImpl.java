package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("zhangsan");
        user.setAge(22);
        return user;
    }
}
