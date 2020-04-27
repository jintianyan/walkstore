package com.xzsd.app.appGoods.entity;

import java.util.List;

public class AppGoodsInfo {
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
     * 书号
     */
    private String bookNumber;
    /**
     * 商品售价
     */
    private String goodsPrice;
    /**
     * 介绍
     */
    private String goodsIntroduce;
    /**
     * 星级
     */
    private String starClass;
    /**
     * 作者
     */
    private String author;
    /**
     * 出版社
     */
    private String press;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 分类编号
     */
    private String sortCode;
    /**
     * 分类名称
     */
    private String sortName;
    /**
     * 商品信息集合
     */
    private List<SecondGoodsInfo> listSecondGoods;
    /**
     * 父级分类编号
     */
    private String sortParentCode;

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public void setStarClass(String starClass) {
        this.starClass = starClass;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public void setListSecondGoods(List<SecondGoodsInfo> listSecondGoods) {
        this.listSecondGoods = listSecondGoods;
    }

    public void setSortParentCode(String sortParentCode) {
        this.sortParentCode = sortParentCode;
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

    public String getBookNumber() {
        return bookNumber;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public String getStarClass() {
        return starClass;
    }

    public String getAuthor() {
        return author;
    }

    public String getPress() {
        return press;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getSortName() {
        return sortName;
    }

    public List<SecondGoodsInfo> getListSecondGoods() {
        return listSecondGoods;
    }

    public String getSortParentCode() {
        return sortParentCode;
    }
}
