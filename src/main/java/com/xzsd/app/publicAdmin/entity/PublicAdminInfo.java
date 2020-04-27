package com.xzsd.app.publicAdmin.entity;

/**
 * @Description 公共信息管理
 * @author jintian
 * @date 2020-04-21
 */
public class PublicAdminInfo {
    /**
     * 用户编号
     */
    private String userCode;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 头像图片路径
     */
    private String photoPath;
    /**
     * 用户账号
     */
    private String userAcct;
    /**
     * 用户密码
     */
    private String userPwd;
    /**
     * 新密码
     */
    private String userNewPwd;
    /**
     * 身份证号码
     */
    private String idCard;
    /**
     * 性别 0 男 1 女
     */
    private String sex;
    /**
     * 角色 0 管理员 1 店长 2 司机
     */
    private String role;
    /**
     * 登录人编号
     */
    private String loginCode;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 门店邀请码
     */
    private String storeInvite;
    /**
     * 门店编号
     */
    private String storeCode;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 省名称
     */
    private String provinceName;
    /**
     * 市名称
     */
    private String cityName;
    /**
     * 区名称
     */
    private String areaName;
    /**
     * 门店地址
     */
    private String storeAddress;
    /**
     * 地址
     */
    private String address;
    /**
     * 作废标记 0为存在，1为作废
     */
    private int isDeleted;
    /**
     * 序号
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

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public void setUserNewPwd(String userNewPwd) {
        this.userNewPwd = userNewPwd;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStoreInvite(String storeInvite) {
        this.storeInvite = storeInvite;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getUserCode() {
        return userCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public String getUserNewPwd() {
        return userNewPwd;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getSex() {
        return sex;
    }

    public String getRole() {
        return role;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getStoreInvite() {
        return storeInvite;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public String getAddress() {
        return address;
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
