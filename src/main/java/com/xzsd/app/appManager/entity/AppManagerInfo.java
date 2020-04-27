package com.xzsd.app.appManager.entity;

import java.util.List;

/**
 * @Description 店长订单实体类
 * @author jintian
 * @date 2020-04-25
 */
public class AppManagerInfo {
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
     * 订单状态(0已下单，1已取消，2已到货，3已取货，4已完成未评价，5已完成已评价)
     */
    private String orderState;
    /**
     * 下单人编号
     */
    private String userCode;
    /**
     * 下单人姓名
     */
    private String userName;
    /**
     * 下单人手机
     */
    private String phone;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 订单总金额
     */
    private String orderAmout;
    /**
     * 下单时间
     */
    private String payTime;
    /**
     * 订单商品总数量
     */
    private int countGoods;
    /**
     * 订单详情列表
     */
    private List<OrderGoodsInfo> listOrderGoods;
    /**
     * 店长名称
     */
    private String managerCode;
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

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrderAmout(String orderAmout) {
        this.orderAmout = orderAmout;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public void setCountGoods(int countGoods) {
        this.countGoods = countGoods;
    }

    public void setListOrderGoods(List<OrderGoodsInfo> listOrderGoods) {
        this.listOrderGoods = listOrderGoods;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode;
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

    public String getUserCode() {
        return userCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getAddress() {
        return address;
    }

    public String getOrderAmout() {
        return orderAmout;
    }

    public String getPayTime() {
        return payTime;
    }

    public int getCountGoods() {
        return countGoods;
    }

    public List<OrderGoodsInfo> getListOrderGoods() {
        return listOrderGoods;
    }

    public String getManagerCode() {
        return managerCode;
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
