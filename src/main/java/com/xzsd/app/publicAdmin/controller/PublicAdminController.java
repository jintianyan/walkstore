package com.xzsd.app.publicAdmin.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.publicAdmin.entity.PublicAdminInfo;
import com.xzsd.app.publicAdmin.service.PublicAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 公用信息管理
 * @author jintian
 * @date 2020-04-21
 */
@RestController
@RequestMapping("/publicAdmin")
public class PublicAdminController {
    public static final Logger logger = LoggerFactory.getLogger(PublicAdminController.class);
    @Resource
    private PublicAdminService publicAdminService;
    /**
     *注册
     * @param publicAdminInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-21
     */
    @PostMapping("addCustomer")
    public AppResponse clientRegister(PublicAdminInfo publicAdminInfo){
        try{
            return publicAdminService.clientRegister(publicAdminInfo);
        } catch (Exception e) {
            logger.error("注册失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询个人信息
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-21
     */
    @RequestMapping("getCustomerInfo")
    public AppResponse getCustomerInfo(){
        try{
            //获取当前登录人code
            String loginCode = SecurityUtils.getCurrentUserId();
            return publicAdminService.getCustomerInfo(loginCode);
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改密码
     * @param
     * @author jintian
     * @date 2020-04-21
     */
    @RequestMapping("updatePassword")
    public AppResponse updatePassword(PublicAdminInfo publicAdminInfo){
        try{
            //获取当前用户的code
            String userCode = SecurityUtils.getCurrentUserId();
            return publicAdminService.updatePassword(publicAdminInfo,userCode);
        } catch (Exception e) {
            logger.error("修改失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
