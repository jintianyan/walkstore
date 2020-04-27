package com.xzsd.app.appGoods.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.appGoods.entity.EvaluatesInfo;
import com.xzsd.app.appGoods.service.AppGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description app商品
 * @author jintian
 * @date 2020-04-23
 */
@RestController
@RequestMapping("/appGoods")
public class AppGoodsController {
    private static final Logger logger = LoggerFactory.getLogger(AppGoodsController.class);
    @Resource
    private AppGoodsService appGoodsService;
    /**
     * 商品详情（app）
     * @param goodsCode
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @RequestMapping(value = "getGoods")
    public AppResponse getGoods(String goodsCode){
        try{
            return appGoodsService.getGoods(goodsCode);
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 商品评价列表
     * @param evaluatesInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-24
     */
    @RequestMapping(value = "listGoodsEvaluates")
    public AppResponse listGoodsEvaluates(EvaluatesInfo evaluatesInfo){
        try{
            //获取当前用户id
            String userCode = SecurityUtils.getCurrentUserId();
            evaluatesInfo.setUserCode(userCode);
            return appGoodsService.listGoodsEvaluates(evaluatesInfo);
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     *查询一级商品分类
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @RequestMapping(value = "listFirstGoodsSort")
    public AppResponse listFirstGoodsSort(){
        try{
            return appGoodsService.listFirstGoodsSort();
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     *查询二级分类及商品
     * @param sortCode
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @RequestMapping(value = "listGetGoodsSort")
    public AppResponse listGetGoodsSort(String sortCode){
        try{
            return appGoodsService.listGetGoodsSort(sortCode);
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
