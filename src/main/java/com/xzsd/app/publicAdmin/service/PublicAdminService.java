package com.xzsd.app.publicAdmin.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.app.publicAdmin.dao.PublicAdminDao;
import com.xzsd.app.publicAdmin.entity.PublicAdminInfo;
import com.xzsd.app.utils.PasswordUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description 公共管理实现类
 * @author jintian
 * @date 2020-04-21
 */
@Service
public class PublicAdminService {
    @Resource
    private PublicAdminDao publicAdminDao;
    /**
     * 注册
     * @param publicAdminInfo
     * @return
     * @author jintian
     * @date 2020-04-21
     */
    public AppResponse clientRegister(PublicAdminInfo publicAdminInfo){
        //校验客户信息是否存在
        int countCustomerInfo = publicAdminDao.countCustomer(publicAdminInfo);
        if(countCustomerInfo != 0){
            return AppResponse.bizError("客户信息已存在，请重新输入！");
        }
        publicAdminInfo.setUserCode(StringUtil.getCommonCode(2));
        publicAdminInfo.setRole("4");
        publicAdminInfo.setCreateBy("customer");
        //新增用户表
        publicAdminInfo.setUserPwd(PasswordUtils.generatePassword(publicAdminInfo.getUserPwd()));
        int countUser = publicAdminDao.addUserTable(publicAdminInfo);
        if(countUser == 0){
            return AppResponse.bizError("新增用户表失败，请重试！");
        }
        //新增客户表
        int countCustomer =publicAdminDao.addCustomerTable(publicAdminInfo);
        if(countCustomer == 0){
            return AppResponse.bizError("新增客户表失败，请重试！");
        }
        return AppResponse.success("注册成功！");
    }
    /**
     * 查询个人信息
     * @param loginCode
     * @return
     * @author jintian
     * @date 2020-04-21
     */
    public AppResponse getCustomerInfo(String loginCode){
        //获取角色
        String role = publicAdminDao.getRoleByCode(loginCode);
        PublicAdminInfo publicAdminInfo = publicAdminDao.getCustomerInfo(loginCode,role);
        return AppResponse.success("查询成功！",publicAdminInfo);
    }
    /**
     * 修改密码
     * @param publicAdminInfo
     * @param userCode
     * @return AppResponse
     * @author jintian
     * @date 2020-04-21
     */
    public AppResponse updatePassword(PublicAdminInfo publicAdminInfo,String userCode){
        //获取当前用户密码
        String userPassword = publicAdminDao.getUserPwdByCode(userCode);
        if(!PasswordUtils.passwordMatch(publicAdminInfo.getUserPwd(),userPassword)){
            return AppResponse.bizError("密码错误，请重试！");
        }
        publicAdminInfo.setUserCode(userCode);
        //新密码加密
        publicAdminInfo.setUserNewPwd(PasswordUtils.generatePassword(publicAdminInfo.getUserNewPwd()));
        int count = publicAdminDao.updatePassword(publicAdminInfo);
        if(count == 0){
            return AppResponse.bizError("版本有变化，请重试！");
        }
        return AppResponse.success("修改成功！");
    }
}
