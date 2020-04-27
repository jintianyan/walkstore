package com.xzsd.app.my.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.my.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 客户端我的
 * @author jintian
 * @date 2020-04-23
 */
@RestController
@RequestMapping("/appInformation")
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);
    @Resource
    private MyService myService;
    /**
     * 修改邀请码(客户端)
     * @param storeInvite
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @PostMapping("updateStoreInvite")
    public AppResponse updateStoreInvite(String storeInvite){
        try{
            //获取当前用户id
            String loginCode = SecurityUtils.getCurrentUserId();
            return myService.updateStoreInvite(storeInvite,loginCode);
        } catch (Exception e) {
            logger.error("修改失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询区域司机信息（店长端）
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-24
     */
    @RequestMapping(value = "listManagerDrivers")
    public AppResponse listManagerDrivers(){
        try{
            //获取当前用户id
            String userCode = SecurityUtils.getCurrentUserId();
            return myService.listManagerDrivers(userCode);
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询所属门店（司机端）
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-24
     */
    @RequestMapping(value = "listDriverStores")
    public AppResponse listDriverStores(){
        try{
            //获取当前用户id
            String userCode = SecurityUtils.getCurrentUserId();
            return myService.listDriverStores(userCode);
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
