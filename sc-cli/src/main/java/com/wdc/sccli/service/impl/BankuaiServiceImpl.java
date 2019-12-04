package com.wdc.sccli.service.impl;

import com.wdc.sccli.entity.Bankuai;
import com.wdc.sccli.service.BankuaiService;
import org.springframework.stereotype.Service;
import com.wdc.sccli.dao.BankuaiDao;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : wanghongwei
 * @Date : 2019/12/4 13:32
 * @Description : 版块业务实现
 */
@Service
public class BankuaiServiceImpl implements BankuaiService {

    @Resource
    private BankuaiDao bankuaiDao;
    /**
     * @param bankuai bankuai
     * @return java.util.List<com.wdc.sccli.entity.Bankuai>
     * @Author: wanghongwei
     * @Date: 2019/12/4 13:50
     * @Description: 查询所有版块信息
     */
    @Override
    public List<Bankuai> getBankuaiList(Bankuai bankuai) {
        return bankuaiDao.getBankuaiList(bankuai.getStatus());
    }
}
