package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by caiteng on 2017-09-21.
 */
@Controller
@RequestMapping("/blog")
public class JumpPageController {



        /**
         * 后台首页
         * @return
         */
        @RequestMapping("/index")
        public ModelAndView demo(){
            return new ModelAndView("blog/index");

        }

}
