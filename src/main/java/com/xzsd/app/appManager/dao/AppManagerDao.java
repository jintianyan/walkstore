package com.xzsd.app.appManager.dao;

import com.xzsd.app.appManager.entity.AppManagerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className AppManagerDao
 * @Description AppManager
 * @author jintian
 * @date 2020-04-25
 */
@Mapper
public interface AppManagerDao {
    /**
     * 查询店长订单列表
     * @param appManagerInfo
     * @return
     */
    List<AppManagerInfo> listManagerOrderByPage(AppManagerInfo appManagerInfo);
    /**
     * 修改店长订单状态
     * @param appManagerInfo
     * @return
     */
    int updateManagerOrderState(AppManagerInfo appManagerInfo);
    /**
     *查询店长订单详情
     * @param orderCode
     * @return
     */
    List<AppManagerInfo> listOrderDetailByPage(@Param("orderCode")String orderCode);
}
