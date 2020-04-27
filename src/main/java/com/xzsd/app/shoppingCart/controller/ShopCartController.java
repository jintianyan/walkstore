package com.xzsd.app.shoppingCart.controller;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.shoppingCart.entity.ShopCartInfo;
import com.xzsd.app.shoppingCart.service.ShopCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 购物车
 * @author jintian
 * @date 2020-04-23
 */
@RestController
@RequestMapping("/appShopCart")
public class ShopCartController {
    private static final Logger logger = LoggerFactory.getLogger(ShopCartController.class);
    @Resource
    private ShopCartService shopCarService;
    /**
     * 新增购物车
     * @param shopCarInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @PostMapping("addShoppingCart")
    public AppResponse addShoppingCart(ShopCartInfo shopCarInfo){
        try{
            //获取当前登录人id
            String userCode = SecurityUtils.getCurrentUserId();
            shopCarInfo.setUserCode(userCode);
            return shopCarService.addShoppingCart(shopCarInfo);
        } catch (Exception e) {
            logger.error("新增失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 查询购物车列表
     * @param shopCartInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @RequestMapping(value = "listShoppingCarts")
    public AppResponse listShoppingCarts(ShopCartInfo shopCartInfo){
        try{
            //获取用户id
            String userCode = SecurityUtils.getCurrentUserId();
            shopCartInfo.setUserCode(userCode);
            return shopCarService.listShoppingCarts(shopCartInfo);
        } catch (Exception e) {
            logger.error("查询失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 修改购物车
     * @param shopCartInfo
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @PostMapping("updateShoppingCart")
    public AppResponse updateShoppingCart(ShopCartInfo shopCartInfo){
        try{
            //获取当前用户id
            String userCode = SecurityUtils.getCurrentUserId();
            shopCartInfo.setLastModifiedBy(userCode);
            return shopCarService.updateShoppingCart(shopCartInfo);
        } catch (Exception e) {
            logger.error("修改失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * 删除购物车
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    @PostMapping("deleteShoppingCart")
    public AppResponse deleteShoppingCart(String shopCarCode){
        try{
            return shopCarService.deleteShoppingCart(shopCarCode);
        } catch (Exception e) {
            logger.error("删除失败！", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
