package com.wdc.sccli.entity;

import lombok.Data;

/**
 * @Author : wanghongwei
 * @Date : 2019/12/4 12:04
 * @Description :板块实体
 */
@Data
public class Bankuai {

    private Integer id;

    //板块名称
    private String name;

    //板块图标
    private String img;

    //板块类型
    private String type;

    //板块父id
    private Integer parentId;

    //板块父名称
    private String parentname;
    //板块描述
    private String descs;
    //板块排序
    private Integer orderBy;
    //发帖限制组 跟积分组关联
    private String fatiegroup;
    //回复限制组 跟积分组关联
    private String huifugroup;

    //查询权限 暂时为使用
    private String findgroup;
    //二级目录名称
    private String yuming;


    //板块创建时间
    private String createTime;

    //板块创建人
    private Integer createUserid;
    //主题数量
    private Integer zhuticount;
    //回复数量
    private Integer huifucount;
    //1 OK 5del
    private Integer status;

    private String banner;

    //父名称---关联父id使用
    private String fname;
    //父id---关联父id使用
    private Integer fid;

    //帖子创建时间---查询该板块最后发帖时间
    private String tiezicreateTime;
    //帖子id---查询该板块最后发帖id
    private String tieziid;
    //帖子名称---查询该板块最后发帖名称
    private String tieziname;
    //用户id---查询该板块最后发帖用户id
    private String userid;
    //用户名称---查询该板块最后发帖用户名称
    private String username;
}
