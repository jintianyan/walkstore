package com.xzsd.app.appManager.entity;

/**
 * @Description 店长订单商品实体类
 * @author jintian
 * @date 2020-04-25
 */
public class OrderGoodsInfo {
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品图片路径
     */
    private String photoPath;
    /**
     * 商品售价
     */
    private String goodsPrice;
    /**
     * 介绍
     */
    private String goodsIntroduce;
    /**
     * 购买数量
     */
    private int buyNumber;

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public int getBuyNumber() {
        return buyNumber;
    }
}
