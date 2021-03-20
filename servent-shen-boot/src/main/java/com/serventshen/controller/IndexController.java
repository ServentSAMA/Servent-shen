package com.serventshen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<p>你好</p>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu","aa"));
        return "success";
    }
}
