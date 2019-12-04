package com.wdc.sccli.common;

import com.wdc.sccli.util.WdcStringUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO
 *
 * @Author : wanghongwei
 * @Date : 2019/12/4 16:09
 * @Description :controller 统一执行类
 */
public class BaseController {

    @Resource
    private HttpServletResponse httpServletResponse;
//转换成JSON字符串回写到页面
    public void BackPageByJason(Object object){
        BackPageByString(WdcStringUtil.toJsonString(object));
    }

    /**
     * @param str
     * @return void
     * @Author: wanghongwei
     * @Date: 2019/12/4 16:12
     * @Description: 返回页面字符串方法
     */
    public void BackPageByString(String str) {
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter writer = httpServletResponse.getWriter();
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
