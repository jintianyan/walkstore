package com.xzsd.app.appOrder.entity;

/**
 * @Description 订单详情实体类
 * @author jintian
 * @date 2020-04-27
 */
public class AppOrderDetailInfo {
    /**
     * 订单详情编号
     */
    private String detailsCode;
    /**
     * 用户编号
     */
    private String userCode;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 购买数量
     */
    private String buyNumber;
    /**
     * 售价
     */
    private double goodsPrice;
    /**
     * 总金额
     */
    private String totalSum;
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

    public void setDetailsCode(String detailsCode) {
        this.detailsCode = detailsCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setBuyNumber(String buyNumber) {
        this.buyNumber = buyNumber;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public void setTotalSum(String totalSum) {
        this.totalSum = totalSum;
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

    public String getDetailsCode() {
        return detailsCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public String getBuyNumber() {
        return buyNumber;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public String getTotalSum() {
        return totalSum;
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
