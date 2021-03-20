package com.serventshen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：申文杰
 * @description：登录请求处理
 * @date ：2020/12/18 13:08
 */
@Controller
public class LoginController {


    @PostMapping(value = "/user/login")
//    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "dashboard";
        }else {
            return "login";
        }
    }
}
