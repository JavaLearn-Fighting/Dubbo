package com.bjpowernode.dubbo.service;

import com.bjpowernode.dubbo.model.User;

public interface UserService {
    /**
     * 根据ID查询用户信息
     * @param id 用户ID
     * @return 用户
     */
    User queryUserById(Integer id);
}
