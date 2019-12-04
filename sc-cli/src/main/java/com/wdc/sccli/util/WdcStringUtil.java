package com.wdc.sccli.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * TODO
 *
 * @Author : wanghongwei
 * @Date : 2019/12/4 16:38
 * @Description :
 */
public class WdcStringUtil {
    public static String toJsonString(Object object){
        String jsonStr = "";
        try {
            jsonStr = JSON.toJSONString(object, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteNullNumberAsZero, SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullBooleanAsFalse, SerializerFeature.WriteMapNullValue});
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return jsonStr;
    }
}
