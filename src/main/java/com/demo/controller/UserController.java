package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
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
@RequestMapping("/")
public class UserController {

    //service类
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public ModelAndView findUser(){
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
