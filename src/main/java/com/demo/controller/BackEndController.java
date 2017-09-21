package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 后台页面接口
 * Created by caiteng on 2017-09-20.
 */
@Controller
@RequestMapping("/backEnd")
public class BackEndController {

    /**
     * 后台首页
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView demo(){
        return new ModelAndView("backEnd/index");
    }

    /**
     * 起始页面
     * @return
     */
    @RequestMapping("/main")
    public ModelAndView main(){
        return new ModelAndView("backEnd/main");
    }

    @RequestMapping("/navbar")
    public ModelAndView navbar(){
        return new ModelAndView("backEnd/navbar");
    }

    /**
     *
     * @return
     */
    @RequestMapping("/form")
    public ModelAndView form(){
        return new ModelAndView("backEnd/form");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/logout")
    public ModelAndView logout(){
        return new ModelAndView("backEnd/logout");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/music")
    public ModelAndView music(){
        return new ModelAndView("backEnd/music");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/btable")
    public ModelAndView btable(){
        return new ModelAndView("backEnd/btable");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/button")
    public ModelAndView button(){
        return new ModelAndView("backEnd/button");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/eatRecord")
    public ModelAndView eatRecord(){
        return new ModelAndView("backEnd/eatRecord");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/table")
    public ModelAndView table(){
        return new ModelAndView("backEnd/table");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/paging")
    public ModelAndView paging(){
        return new ModelAndView("backEnd/paging");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/data")
    public ModelAndView data(){
        return new ModelAndView("backEnd/data");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/addEatRecord")
    public ModelAndView addEatRecord(){
        return new ModelAndView("backEnd/addEatRecord");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/tab")
    public ModelAndView tab(){
        return new ModelAndView("backEnd/tab");
    }
    /**
     *
     * @return
     */
    @RequestMapping("/auxiliar")
    public ModelAndView auxiliar(){
        return new ModelAndView("backEnd/auxiliar");
    }
}

