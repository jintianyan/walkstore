package com.xzsd.app.homePage.entity;

/**
 * @description app首页实体类
 * @author jintian
 * @date 2020-04-22
 */
public class HomePageInfo {
    /**
     * 轮播图路径
     */
    private String chartRoute;
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
     * 展示数量
     */
    private int showNumber;
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

    public void setChartRoute(String chartRoute) {
        this.chartRoute = chartRoute;
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

    public void setShowNumber(int showNumber) {
        this.showNumber = showNumber;
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

    public String getChartRoute() {
        return chartRoute;
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

    public int getShowNumber() {
        return showNumber;
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
