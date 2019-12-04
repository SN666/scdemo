package com.wdc.sccli.service;

import com.wdc.sccli.entity.Bankuai;

import java.util.List;

/**
 * @Author : wanghongwei
 * @Date : 2019/12/4 13:31
 * @Description : 版块业务接口
 */
public interface BankuaiService {

    /**
     * @param bankuai bankuai
     * @return java.util.List<com.wdc.sccli.entity.Bankuai>
     * @Author: wanghongwei
     * @Date: 2019/12/4 13:50
     * @Description: 查询所有版块信息
     */
    List<Bankuai> getBankuaiList(Bankuai bankuai);

}
