package com.wdc.sccli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/list")
    @ResponseBody
    public String list(HttpServletRequest request){

        System.out.println("测试list");
        return "测试/test/list";
    }
}
