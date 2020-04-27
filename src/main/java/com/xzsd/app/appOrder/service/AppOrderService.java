package com.xzsd.app.appOrder.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.app.appOrder.dao.AppOrderDao;
import com.xzsd.app.appOrder.entity.AppOrderInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @Description app客户订单实现类
 * @author jintian
 * @date 2020-04-25
 */
@Service
public class AppOrderService {
    @Resource
    private AppOrderDao appOrderDao;
    /**
     * 查询客户订单列表
     * @param appOrderInfo
     * @return
     * @author jintian
     * @date 2020-04-26
     */
    public AppResponse listOrder(AppOrderInfo appOrderInfo){
        List<AppOrderInfo> listAppOrderByPage = appOrderDao.listAppOrderByPage(appOrderInfo);
        return AppResponse.success("查询成功！",getPageInfo(listAppOrderByPage));
    }
    /**
     * 修改订单状态
     * @param appOrderInfo
     * @return
     * @author jintian
     * @date 2020-04-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateOrderState(AppOrderInfo appOrderInfo){
        int count = appOrderDao.updateOrderState(appOrderInfo);
        if(count == 0){
            return AppResponse.bizError("订单信息有变化，请刷新！");
        }
        return AppResponse.success("修改成功！");
    }
    /**
     * 查询订单详情
     * @param orderCode
     * @return
     * @author jintian
     * @date 2020-04-26
     */
    public AppResponse listOrderDetail(String orderCode){
        List<AppOrderInfo> getOrderByCode = appOrderDao.getOrderByPage(orderCode);
        return AppResponse.success("查询成功！",getPageInfo(getOrderByCode));
    }
    /**
     * 查询订单评价商品
     * @param orderCode
     * @return
     * @author jintian
     * @date 2020-04-25
     */
    public AppResponse listGoodsForEvaluate(String orderCode){
        List<AppOrderInfo> listGoodsByPage = appOrderDao.listGoodsByPage(orderCode);
        return AppResponse.success("查询成功",getPageInfo(listGoodsByPage));
    }
    /**
     * 新增订单商品评价
     * @param
     * @return
     * @author jintian
     * @date 2020-04-25
     */
    public AppResponse addGoodsEvaluate(AppOrderInfo appOrderInfo){
        //新增评价
        appOrderInfo.setEvaluateCode(StringUtil.getCommonCode(2));
        int countAdd = appOrderDao.addGoodsEvaluate(appOrderInfo);
        if(countAdd == 0){
            return AppResponse.bizError("评价失败，请稍后再试");
        }
//        //修改订单状态
//        int countUpdate = appOrderDao.updateOrderState(appOrderInfo);
//        if(countUpdate == 0){
//            return AppResponse.bizError("订单状态修改失败，请重试");
//        }
        return AppResponse.success("评价成功！");
    }
}
