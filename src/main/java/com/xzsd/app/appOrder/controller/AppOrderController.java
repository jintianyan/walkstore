package com.xzsd.app.appOrder.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.appOrder.entity.AppOrderInfo;
import com.xzsd.app.appOrder.service.AppOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description app客户订单
 * @author jintian
 * @date 2020-04-24
 */
@RestController
@RequestMapping("/appOrder")
public class AppOrderController {
    private static final Logger logger = LoggerFactory.getLogger(AppOrderController.class);
    @Resource
    private AppOrderService appOrderService;
    /**
     * 新增订单
     * @param appOrderInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-27
     */
    @PostMapping("addOrder")
    public AppResponse addOrder(AppOrderInfo appOrderInfo){
        try{
            return appOrderService.addOrder(appOrderInfo);
        } catch (Exception e) {
            logger.error("购买失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询订单列表
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-26
     */
    @RequestMapping(value = "listOrder")
    public AppResponse listOrder(AppOrderInfo appOrderInfo){
        try{
            //获取当前用户id
            String userCode = SecurityUtils.getCurrentUserId();
            appOrderInfo.setUserCode(userCode);
            return appOrderService.listOrder(appOrderInfo);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改订单状态
     * @param
     * @return
     * @author jintian
     * @date 2020-04-26
     */
    @RequestMapping(value = "updateOrderState")
    public AppResponse updateOrderState(AppOrderInfo appOrderInfo){
        try{
            //获取当前用户id
            String userCode = SecurityUtils.getCurrentUserId();
            appOrderInfo.setUserCode(userCode);
            return appOrderService.updateOrderState(appOrderInfo);
        } catch (Exception e) {
            logger.error("修改失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询客户订单详情
     * @param orderCode
     * @return AppResponse
     * @author jintian
     * @date 2020-04-26
     */
    @RequestMapping(value = "listOrderDetail")
    public AppResponse listOrderDetail(String orderCode){
        try{
            return appOrderService.listOrderDetail(orderCode);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询订单评价商品
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-24
     */
    @RequestMapping(value = "listGoodsForEvaluate")
    public AppResponse listGoodsForEvaluate(String orderCode){
        try{
            return appOrderService.listGoodsForEvaluate(orderCode);
        } catch (Exception e) {
            logger.error("查询失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 新增订单商品评价
     * @param appOrderInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-25
     */
    @RequestMapping(value = "addGoodsEvaluate")
    public AppResponse addGoodsEvaluate(AppOrderInfo appOrderInfo){
        try{
            //获取当前用户id
            String userCode = SecurityUtils.getCurrentUserId();
            appOrderInfo.setUserCode(userCode);
            return appOrderService.addGoodsEvaluate(appOrderInfo);
        } catch (Exception e) {
            logger.error("新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
