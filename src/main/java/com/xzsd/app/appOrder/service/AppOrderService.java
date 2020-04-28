package com.xzsd.app.appOrder.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.StringUtil;
import com.xzsd.app.appOrder.dao.AppOrderDao;
import com.xzsd.app.appOrder.entity.AppOrderDetailInfo;
import com.xzsd.app.appOrder.entity.AppOrderInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
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
     * 新增客户订单
     * @param
     * @return
     * @author jintian
     * @date 2020-04-27
     */
    public AppResponse addOrder(AppOrderInfo appOrderInfo){
        List<String>listGoodsCode = Arrays.asList(appOrderInfo.getGoodsCode());
        //获取库存（与商品编号对应）
        List<String>listGoodsStock = appOrderDao.getGoodsStock(listGoodsCode);
        List<String>listGoodsPrice = Arrays.asList(appOrderInfo.getGoodsPrice());
        List<String>listBuyNumber = Arrays.asList(appOrderInfo.getBuyNumber());
        //计算每个商品的总价(商品详情)
        List<String>listTotalSum = new ArrayList<>();
        List<String>listStock = new ArrayList<>();
        Double amout = new Double(0);
        for(int i = 0; i<listGoodsCode.size();i++){
            //将价格、数量、库存转化为double
            Double goodsPrice = Double.parseDouble(listGoodsPrice.get(i));
            Double buyNumber = Double.parseDouble(listBuyNumber.get(i));
            Double goodsStock = Double.parseDouble(listGoodsStock.get(i));
            //商品总价=商品价格*数量
            Double sum = goodsPrice*buyNumber;
            //库存-购买数量（>0库存足够/<0库存不足）
            Double sumStock = goodsStock-buyNumber;
            amout = sum + amout;
            //double 转化为string
            String totalSum = String.format("%.2f",sum);
            String goodsStocks = String.valueOf(sumStock);
            String stock = sumStock.toString();
            //将商品总价、库存余量存进各自的list
            listTotalSum.add(totalSum);
            listStock.add(goodsStocks);
        }
        //计算订单总价
        String orderAmout = String.format("%.2f",amout);
        List<String>listShopCarCode = Arrays.asList(appOrderInfo.getShopCarCode());
        String orderCode = StringUtil.getCommonCode(2);
        String userCode = SecurityUtils.getCurrentUserId();
        List<String> listNotStock = new ArrayList<>();
        List<String> listShopCar = new ArrayList<>();
        List<AppOrderInfo> listOrder = new ArrayList<>();
        //商品数量
        int countGoods = 0;
        //完善订单详情信息
        List<AppOrderDetailInfo> listAppOrderDetail = new ArrayList<>();
        for(int i = 0; i < listGoodsCode.size(); i++){
            Double test = Double.parseDouble(listStock.get(i));
            if(test >= 0){
                AppOrderDetailInfo orderDetailInfo = new AppOrderDetailInfo();
                AppOrderInfo orderInfo = new AppOrderInfo();
                orderDetailInfo.setDetailsCode(StringUtil.getCommonCode(2));
                orderDetailInfo.setUserCode(userCode);
                orderDetailInfo.setOrderCode(orderCode);
                orderDetailInfo.setGoodsCode(listGoodsCode.get(i));
                orderDetailInfo.setBuyNumber(listBuyNumber.get(i));
                orderDetailInfo.setTotalSum(listTotalSum.get(i));
                listAppOrderDetail.add(orderDetailInfo);
                //订单数据
                countGoods = countGoods + 1;
                orderInfo.setStock(listStock.get(i));
                orderInfo.setGoodsCode(listGoodsCode.get(i));
                listOrder.add(orderInfo);
                listShopCar.add(listShopCarCode.get(i));
            }else{
                listNotStock.add(listGoodsCode.get(i));
            }
        }
        //完善订单信息
        appOrderInfo.setOrderCode(orderCode);
        appOrderInfo.setUserCode(userCode);
        appOrderInfo.setOrderAmout(orderAmout);
        appOrderInfo.setCountGoods(listShopCar.size());

        if(listNotStock.size() == listGoodsCode.size()){
            return AppResponse.bizError("购买失败，购买商品编号为"+listNotStock+"库存不足，无法购买");
        }
        //新增订单详情
        int countDetail = appOrderDao.addOrderDetail(listAppOrderDetail);
        int countOrder = appOrderDao.addOrderInfo(appOrderInfo);
        if(countDetail == 0 || countOrder == 0){
            return AppResponse.bizError("购买失败，请重试！");
        }
        if(listNotStock.size() != 0 && listNotStock.size() != listGoodsCode.size()){
            return AppResponse.success("部分商品购买成功，商品编号为"+listNotStock+"库存不足，无法购买");
        }
        //减少库存（修改库存）
        int countStock = appOrderDao.updateGoodsStock(listOrder);
        if(countStock == 0){
            return AppResponse.success("修改库存失败，请重试");
        }
        //删除购物车
        if(listShopCar.size() != 0 && !"".equals(listShopCar)){
            int countShopCarCode = appOrderDao.deleteShopCarCode(listShopCar);
            if(countShopCarCode == 0){
                return AppResponse.success("修改购物车信息失败，请重试");
            }
        }
        return AppResponse.success("购买成功！");
    }
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
