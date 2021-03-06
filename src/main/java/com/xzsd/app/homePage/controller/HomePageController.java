package com.xzsd.app.homePage.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.homePage.service.HomePageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description app客户端
 * @author jintian
 * @date 2020-04-22
 */
@RestController
@RequestMapping("/homePage")
public class HomePageController {
    private static final Logger logger = LoggerFactory.getLogger(HomePageController.class);
    @Resource
    private HomePageService homePageService;
    /**
     * 查询首页轮播图
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-22
     */
    @RequestMapping(value = "listRotationChartHome")
    public AppResponse listRotationChartHome(){
        try{
            return homePageService.listRotationChartHome();
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询热门商品
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-22
     */
    @RequestMapping(value = "listHotGoods")
    public AppResponse listHotGoods(){
        try{
            return homePageService.listHotGoods();
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
