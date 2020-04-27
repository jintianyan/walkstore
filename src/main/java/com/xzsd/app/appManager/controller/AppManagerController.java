package com.xzsd.app.appManager.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.appManager.entity.AppManagerInfo;
import com.xzsd.app.appManager.service.AppManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 店长订单
 * @author jintian
 * @date 2020-04-25
 */
@RestController
@RequestMapping("/managerOrder")
public class AppManagerController {
    private static final Logger logger = LoggerFactory.getLogger(AppManagerController.class);
    @Resource
    private AppManagerService appManagerService;
    /**
     * 查询店长订单列表
     * @param appManagerInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-25
     */
    @RequestMapping(value = "listManagerOrders")
    public AppResponse listManagerOrders(AppManagerInfo appManagerInfo){
        try{
            //获取用户id
            String managerCode = SecurityUtils.getCurrentUserId();
            appManagerInfo.setManagerCode(managerCode);
            return appManagerService.listManagerOrders(appManagerInfo);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改店长订单状态
     * @param appManagerInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-26
     */
    @PostMapping("updateManagerOrderState")
    public AppResponse updateManagerOrderState(AppManagerInfo appManagerInfo){
        try{
            //获取用户id
            String userCode = SecurityUtils.getCurrentUserId();
            appManagerInfo.setLastModifiedBy(userCode);
            return appManagerService.updateManagerOrderState(appManagerInfo);
        } catch (Exception e) {
            logger.error("修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询店长订单详情
     * @param orderCode
     * @return AppResponse
     * @author jintian
     * @date 2020-04-26
     */
    @RequestMapping(value = "listManagerOrderDetail")
    public AppResponse listManagerOrderDetail(String orderCode){
        try{
            return appManagerService.listManagerOrderDetail(orderCode);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
