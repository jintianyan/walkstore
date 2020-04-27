package com.xzsd.app.appGoods.entity;

/**
 * @Description 商品评价实体类
 * @author jintian
 * @date 2020-04-24
 */
public class EvaluatesInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 评价编号
     */
    private String evaluateCode;
    /**
     * 用户编号
     */
    private String userCode;
    /**
     * 用户账号
     */
    private String userAcct;
    /**
     * 商品编号
     */
    private String goodsCode;
    /**
     * 星级
     */
    private int starClass;
    /**
     * 评价内容
     */
    private String evaluateContent;
    /**
     * 评价时间
     */
    private String createTime;
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

    public void setEvaluateCode(String evaluateCode) {
        this.evaluateCode = evaluateCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
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

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

    public String getEvaluateCode() {
        return evaluateCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getUserAcct() {
        return userAcct;
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

    public String getCreateTime() {
        return createTime;
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
