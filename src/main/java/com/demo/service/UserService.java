package com.demo.service;

import com.demo.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017-07-25.
 */
public interface UserService {

    public User get(int id);

    List<User> getAll();

}
