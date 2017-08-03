package com.demo.service;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-07-25.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    //User接口
    @Autowired
    private UserMapper userDao;

    public User get(int id)  {
        User users = userDao.selectByPrimaryKey(id);
        return users;
    }

    public List<User> getAll(){
       return userDao.getAll();
    }
}
