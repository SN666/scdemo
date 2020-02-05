package com.wdc.sccli;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScCliApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testJason(){

    }

    public static void main(String[] args) {
        String str ="[{\"code\":\"9901\",\"msg\":\"该客户土地种植面积不符合我行授信审批要\"}]";
        JSONArray list = JSONArray.parseArray(str);
        System.out.println(list.getJSONObject(0));
       // JSONObject jsonObject = list.getJSONObject(0);
        System.out.println(list.getJSONObject(0).getString("code"));
        System.out.println(list.getJSONObject(0).getString("msg"));
    }

}
