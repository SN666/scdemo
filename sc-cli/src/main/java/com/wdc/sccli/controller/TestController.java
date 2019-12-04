package com.wdc.sccli.controller;

import com.wdc.sccli.entity.Bankuai;
import com.wdc.sccli.service.BankuaiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    BankuaiService bankuaiService;
    @RequestMapping("/list")
    @ResponseBody
    public String list(HttpServletRequest request){

        System.out.println("测试list");
        return "测试/test/list";
    }
    @RequestMapping("/getBankuaiList")
    @ResponseBody
    public List<Bankuai> getBankuaiList(Bankuai bankuai){

        System.out.println("getBankuaiList");
        bankuai.setStatus(1);
        return bankuaiService.getBankuaiList(bankuai);
    }
}
