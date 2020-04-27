package com.xzsd.app.appOrder.entity;

import com.xzsd.app.appGoods.entity.EvaluatesInfo;
import com.xzsd.app.appManager.entity.OrderGoodsInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description app订单实体类
 * @author jintian
 * @date 2020-04-25
 */
public class AppOrderInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 订单状态
     */
    private String orderState;
    /**
     * 订单总价
     */
    private String orderAmout;
    /**
     * 订单商品数量
     */
    private int countGoods;
    /**
     * 订单商品集合
     */
    private List<OrderGoodsInfo> listOrderGoods;
    /**
     * 评价编号
     */
    private String evaluateCode;
    /**
     * 用户编号
     */
    private String userCode;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 商品等级
     */
    private int starClass;
    /**
     * 评价内容
     */
    private String evaluateContent;
    /**
     * 商品图片路径
     */
    private String photoPath;
    /**
     * 作废标记 0为存在，1为作废
     */
    private int isDeleted;
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新时间
     */
    private String gmtModified;
    /**
     * 更新者
     */
    private String lastModifiedBy;
    /**
     * 版本号
     */
    private String version;

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public void setOrderAmout(String orderAmout) {
        this.orderAmout = orderAmout;
    }

    public void setCountGoods(int countGoods) {
        this.countGoods = countGoods;
    }

    public void setListOrderGoods(List<OrderGoodsInfo> listOrderGoods) {
        this.listOrderGoods = listOrderGoods;
    }

    public void setEvaluateCode(String evaluateCode) {
        this.evaluateCode = evaluateCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setStarClass(int starClass) {
        this.starClass = starClass;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getOrderState() {
        return orderState;
    }

    public String getOrderAmout() {
        return orderAmout;
    }

    public int getCountGoods() {
        return countGoods;
    }

    public List<OrderGoodsInfo> getListOrderGoods() {
        return listOrderGoods;
    }

    public String getEvaluateCode() {
        return evaluateCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public int getStarClass() {
        return starClass;
    }

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public String getVersion() {
        return version;
    }
}
