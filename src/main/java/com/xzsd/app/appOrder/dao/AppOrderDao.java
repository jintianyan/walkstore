package com.xzsd.app.appOrder.dao;

import com.xzsd.app.appOrder.entity.AppOrderDetailInfo;
import com.xzsd.app.appOrder.entity.AppOrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className AppOrderDao
 * @Description appOrder
 * @author jintian
 * @date 2020-04-25
 */
@Mapper
public interface AppOrderDao {
    /**
     * 查询商品的库存列表
     * @param listGoodsCode
     * @return
     */
    List<String> getGoodsStock(@Param("listGoodsCode")List<String> listGoodsCode);
    /**
     * 新增订单详情
     * @param listAppOrderDetail
     * @return
     */
    int addOrderDetail(@Param("listAppOrderDetail")List<AppOrderDetailInfo>listAppOrderDetail);
    /**
     * 新增订单信息
     * @param appOrderInfo
     * @return
     */
    int addOrderInfo(AppOrderInfo appOrderInfo);
    /**
     * 减少库存
     * @param listOrder
     * @return
     */
    int updateGoodsStock(@Param("listOrder")List<AppOrderInfo>listOrder);
    /**
     * 删除购物车
     * @param listShopCar
     * @return
     */
    int deleteShopCarCode(@Param("listShopCar")List<String>listShopCar);
    /**
     * 查询客户订单列表
     * @param appOrderInfo
     * @return
     */
    List<AppOrderInfo> listAppOrderByPage(AppOrderInfo appOrderInfo);
    /**
     * 修改客户订单
     * @param appOrderInfo
     * @return
     */
    int updateOrderState(AppOrderInfo appOrderInfo);
    /**
     * 查询订单详情
     * @param orderCode
     * @return
     */
    List<AppOrderInfo> getOrderByPage(@Param("orderCode")String orderCode);
    /**
     * 查询订单评价商品
     * @param orderCode
     * @return
     */
    List<AppOrderInfo> listGoodsByPage(@Param("orderCode")String orderCode);
    /**
     * 新增订单商品评价
     * @param appOrderInfo
     * @return
     */
    int addGoodsEvaluate(AppOrderInfo appOrderInfo);
}
