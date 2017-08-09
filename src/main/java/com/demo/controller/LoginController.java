package com.demo.controller;

import com.demo.util.JsonUtil;
import org.apache.shiro.SecurityUtils;
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
        ModelAndView mav = new ModelAndView("login");
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
        Map<String, Object> result = new HashMap<String, Object>();
        try{
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            Subject currentUser = SecurityUtils.getSubject();
            if (!currentUser.isAuthenticated()){
                //使用shiro来验证
                token.setRememberMe(true);
                currentUser.login(token);//验证角色和权限
            }
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        result.put("success", true);
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
