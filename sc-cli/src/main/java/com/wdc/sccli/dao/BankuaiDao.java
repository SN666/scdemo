package com.wdc.sccli.dao;

import com.wdc.sccli.entity.Bankuai;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author : wanghongwei
 * @Date : 2019/12/4 13:30
 * @Description :
 */
@Mapper
public interface BankuaiDao {
    /**
     * @param status status
     * @return java.util.List<com.wdc.sccli.entity.Bankuai>
     * @Author: wanghongwei
     * @Date: 2019/12/4 13:50
     * @Description: 查询所有版块信息
     */
    List<Bankuai> getBankuaiList(@Param("status")Integer status);
}
