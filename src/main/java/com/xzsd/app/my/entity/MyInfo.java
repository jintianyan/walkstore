package com.xzsd.app.my.entity;

/**
 * @Description 我的实体类
 * @author jintian
 * date 2020-04-23
 */
public class MyInfo {
    /**
     * 门店邀请码
     */
    private String StoreInvite;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 门店编号
     */
    private String storeCode;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 门店地址
     */
    private String address;

    public void setStoreInvite(String storeInvite) {
        StoreInvite = storeInvite;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreInvite() {
        return StoreInvite;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getAddress() {
        return address;
    }
}
