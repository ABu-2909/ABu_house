package com.tj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //标识此类是一个后端控制器
@RequestMapping("/my")
public class MyController {
    @Value("${name}")
    private String name;

    @ResponseBody //可以把返回值转换为json数据再前端渲染
    @RequestMapping("/test01")
    public String test01(){
        System.out.println(name);
        return "springboot快速搭建成功启动";
    }

}
