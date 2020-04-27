package com.xzsd.app.shoppingCart.entity;

import java.util.List;

/**
 * @Description 购物车实体类
 * @author  jintian
 * @date 2020-04-23
 */
public class ShopCartInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 购物车编号
     */
    private String shopCarCode;
    /**
     * 用户编号
     */
    private String userCode;
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
     * 购买数量
     */
    private int buyNumber;
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

    public void setShopCarCode(String shopCarCode) {
        this.shopCarCode = shopCarCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
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

    public String getShopCarCode() {
        return shopCarCode;
    }

    public String getUserCode() {
        return userCode;
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

    public int getBuyNumber() {
        return buyNumber;
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
