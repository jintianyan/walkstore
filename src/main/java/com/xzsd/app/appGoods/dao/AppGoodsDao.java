package com.xzsd.app.appGoods.dao;

import com.xzsd.app.appGoods.entity.AppGoodsInfo;
import com.xzsd.app.appGoods.entity.EvaluatesInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @class AppGoodsDao
 * @Description appGoods
 * @author jintian
 * @date 2020-04-23
 */
@Mapper
public interface AppGoodsDao {
    /**
     * 商品详情（app）
     * @param goodsCode
     * @return
     */
    AppGoodsInfo getGoods(@Param("goodsCode")String goodsCode);
    /**
     * 查询商品评价
     * @param evaluatesInfo
     * @return
     */
    List<EvaluatesInfo> listEvaluatesByPage(EvaluatesInfo evaluatesInfo);
    /**
     * 查询一级商品分类
     * @param
     * @return
     */
    List<AppGoodsInfo> listFirstGoodsSort();
    /**
     * 查询二级商品分类及商品
     * @param sortCode
     * @return
     */
    List<AppGoodsInfo> listGetSortByPage(@Param("sortCode")String sortCode);
}
