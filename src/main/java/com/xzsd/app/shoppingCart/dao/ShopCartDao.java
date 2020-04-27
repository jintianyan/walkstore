package com.xzsd.app.shoppingCart.dao;

import com.xzsd.app.shoppingCart.entity.ShopCartInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className ShopCarDao
 * @Description ShopCar
 * @author jintian
 * @date 2020-04-23
 */
@Mapper
public interface ShopCartDao {
    /**
     * 校验商品库存
     * @param shopCartInfo
     * @return
     */
    int countStock(ShopCartInfo shopCartInfo);
    /**
     * 校验商品是否存在
     * @param shopCartInfo
     * @return
     */
    int countGoods(ShopCartInfo shopCartInfo);
    /**
     * 修改购物车原有商品数量
     * @param shopCarInfo
     * @return
     */
    int updateNumber(ShopCartInfo shopCarInfo);
    /**
     * 新增购物车商品
     * @param shopCarInfo
     * @return
     */
    int addShopCar(ShopCartInfo shopCarInfo);
    /**
     * 查询购物车列表
     * @param shopCartInfo
     * @return
     */
    List<ShopCartInfo> listShopCartByPage(ShopCartInfo shopCartInfo);
    /**
     * 修改购物车数量
     * @param shopCartInfo
     * @return
     */
    int updateShoppingCart(ShopCartInfo shopCartInfo);
    /**
     * 删除购物车
     * @param listCode
     * @return
     */
    int deleteShoppingCart(@Param("listCode")List<String> listCode);
}
