package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2017-07-25.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //service类
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public ModelAndView findUser(){
        UsernamePasswordToken token = new UsernamePasswordToken("aaa", "123");
//        SecurityUtils.setSecurityManager(securityManager); // 注入SecurityManager
        Subject subject = SecurityUtils.getSubject(); // 获取Subject单例对象
        subject.login(token); // 登陆

        ModelAndView modelAndView = null;
            modelAndView = new ModelAndView();
            //调用service方法得到用户列表
            List<User> users = userService.getAll();
            //将得到的用户列表内容添加到ModelAndView中
            modelAndView.addObject("users",users);
            //设置响应的jsp视图
            modelAndView.setViewName("userList");
        return modelAndView;
    }


    @RequestMapping("/validate")
    public void validate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("name");
        //List<User> users = userService.get(name);
        PrintWriter out = response.getWriter();
        out.print(name);
    }


}
