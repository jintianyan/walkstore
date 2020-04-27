package com.xzsd.app.appOrder.dao;

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
