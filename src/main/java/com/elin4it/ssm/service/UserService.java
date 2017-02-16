package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.User;

import java.util.List;

/**
 * Created by ccpg on 2017/2/15.
 */
public interface UserService {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
}
