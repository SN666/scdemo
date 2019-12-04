package com.wdc.sccli;

import com.wdc.sccli.entity.Bankuai;
import com.wdc.sccli.util.WdcStringUtil;
import org.junit.Test;
import org.mockito.internal.util.reflection.GenericMetadataSupport;

/**
 * TODO
 *
 * @Author : wanghongwei
 * @Date : 2019/12/4 16:50
 * @Description :
 */
public class TestUtil {
    @Test
    public void TestWdcStringUtil(){
        Persion p = new Persion();
        p.setName(null);
        p.setAge("15");
        System.out.println(WdcStringUtil.toJsonString(p));

    }
}
