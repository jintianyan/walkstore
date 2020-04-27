package com.xzsd.app.my.dao;

import com.xzsd.app.my.entity.MyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className MyDao
 * @Description my
 * @author jintian
 * @date 2020-04-23
 */
@Mapper
public interface MyDao {
    /**
     * 校验邀请码（客户端）
     * @param storeInvite
     * @return
     */
    int countInvite(@Param("storeInvite")String storeInvite);
    /**
     * 修改邀请码
     * @param storeInvite
     * @param loginCode
     * @return
     */
    int updateInvite(@Param("storeInvite")String storeInvite, @Param("loginCode")String loginCode);
    /**
     * 查询区域司机信息（店长端）
     * @param userCode
     * @return
     */
    List<MyInfo> getDriverByPage(@Param("userCode")String userCode);
    /**
     * 查询所属门店（司机端）
     * @param userCode
     * @return
     */
    List<MyInfo> getStoreByPage(@Param("userCode")String userCode);
}
