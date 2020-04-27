package com.xzsd.app.publicAdmin.dao;

import com.xzsd.app.publicAdmin.entity.PublicAdminInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @class PublicAdminDao
 * @description publicAdmin
 * @author jintian
 * @date 2020-04-21
 */
@Mapper
public interface PublicAdminDao {
    /**
     * 校验客户信息是否存在
     * @param publicAdminInfo
     * @return
     */
    int countCustomer(PublicAdminInfo publicAdminInfo);
    /**
     * 新增用户表
     * @param publicAdminInfo
     * @return
     */
    int addUserTable(PublicAdminInfo publicAdminInfo);
    /**
     * 新增客户表
     * @param publicAdminInfo
     * @return
     */
    int addCustomerTable(PublicAdminInfo publicAdminInfo);
    /**
     * 查询角色
     * @param loginCode
     * @return
     */
    String getRoleByCode(@Param("loginCode")String loginCode);
    /**
     * 查询个人信息
     * @param loginCode
     * @param role
     * @return
     */
    PublicAdminInfo getCustomerInfo(@Param("loginCode")String loginCode,@Param("role")String role);
    /**
     * 获取当前用户密码
     * @param userCode
     * @return
     */
    String getUserPwdByCode(@Param("userCode")String userCode);
    /**
     * 修改密码
     * @param publicAdminInfo
     * @return
     */
    int updatePassword(PublicAdminInfo publicAdminInfo);
}
