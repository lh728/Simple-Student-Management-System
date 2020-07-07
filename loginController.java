package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
//这是index层,目的是连接前端并且接收前端数据
public class loginController {
    @Autowired
    private com.example.service.loginService loginService;


    @RequestMapping("/userLogin")
    public String userLogin(){
        return "login";
    }
    @RequestMapping("/getLogin")
    public String getLogin(@RequestParam("name")String name,@RequestParam("password")int password,@RequestParam("id")int id){
        //1 传入name,password 判断 用户 密码是否正确

        //2 如果正确 跳转到 index  如果不正确 回到 login
        boolean judge = loginService.Find(name,password);
        System.out.println(name);
        System.out.println(password);
        System.out.println(id);
        if(judge == true) {
            return "/loginSuccessful";
        }
        return "/loginFail";
    }
}
