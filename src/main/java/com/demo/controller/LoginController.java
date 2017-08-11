package com.demo.controller;

import com.demo.util.JsonUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-08-09.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    //跳转到登录页面
    @RequestMapping("/login")
    public ModelAndView login() throws Exception {
        ModelAndView mav = new ModelAndView("login/login");
        return mav;
    }
    //跳转到登录页面
    @RequestMapping("/login2")
    public ModelAndView login2() throws Exception {
        ModelAndView mav = new ModelAndView("login/login2");
        return mav;
    }

    //跳转到登录成功页面
    @RequestMapping("/loginsuccess")
    public ModelAndView loginsuccess() throws Exception {
        ModelAndView mav = new ModelAndView("loginsuccess");
        return mav;
    }

    /**
     * 验证用户名和密码
     */
    @RequestMapping(value="/checkLogin.json",method= RequestMethod.POST)
    @ResponseBody
    public String checkLogin(String username,String password) throws Exception {
        System.out.println("checkLogin");
        Map<String, Object> result = new HashMap<String, Object>();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated()) {
            token.setRememberMe(true);
            try {
                subject.login(token);//验证角色和权限
            } catch (IncorrectCredentialsException ice) {
                // 捕获密码错误异常
                result.put("error","账号或密码错误");
                return JsonUtil.toJson(result);
            } catch (UnknownAccountException uae) {
                // 捕获未知用户名异常
                result.put("error","账号或密码错误");
                return JsonUtil.toJson(result);
            } catch (ExcessiveAttemptsException eae) {
                // 捕获错误登录过多的异常
                result.put("error", "登录错误次数过多");
                return JsonUtil.toJson(result);
            }
        }
        result.put("success", "登录成功");
        return JsonUtil.toJson(result);
    }

    /**
     * 退出登录
     */
    @RequestMapping(value="/logout.json",method=RequestMethod.POST)
    @ResponseBody
    public String logout() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", true);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return JsonUtil.toJson(result);
    }
}

