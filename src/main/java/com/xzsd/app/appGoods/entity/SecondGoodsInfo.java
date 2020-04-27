package com.xzsd.app.appGoods.entity;

/**
 * @Description 二级分类商品查询
 * @author jintian
 * @date 2020-04-23
 */
public class SecondGoodsInfo {
    /**
     * 分类编号
     */
    private String sortCode;
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

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
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

    public String getSortCode() {
        return sortCode;
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
}
