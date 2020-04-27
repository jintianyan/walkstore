package com.xzsd.app.my.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.my.dao.MyDao;
import com.xzsd.app.my.entity.MyInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @Description 客户我的实现类
 * @author jintian
 * @date 2020-04-23
 */
@Service
public class MyService {
    @Resource
    private MyDao myDao;
    /**
     * 修改邀请码（客户端）
     * @param storeInvite
     * @param loginCode
     * @return
     * @author jintian
     * @date 2020-04-23
     */
    public AppResponse updateStoreInvite(String storeInvite, String loginCode){
        //校验邀请码是否存在
        int countInvite = myDao.countInvite(storeInvite);
        if(countInvite == 0){
            return AppResponse.bizError("门店邀请码不存在，请重新输入！");
        }
        //修改邀请码
        int count = myDao.updateInvite(storeInvite,loginCode);
        if(count == 0){
            return AppResponse.bizError("修改失败，请重试！");
        }
        return AppResponse.success("修改成功！");
    }
    /**
     * 查询区域司机信息（店长端）
     * @param userCode
     * @return
     * @author jintian
     * @date 2020-04-24
     */
    public AppResponse listManagerDrivers(String userCode){
        List<MyInfo> getDriverByPage = myDao.getDriverByPage(userCode);
        return AppResponse.success("查询成功！",getPageInfo(getDriverByPage));
    }
    /**
     * 查询所属店铺（司机端）
     * @param userCode
     * @return
     * @author jintian
     * @date 2020-04-24
     */
    public AppResponse listDriverStores(String userCode){
        List<MyInfo> getStoreByPage = myDao.getStoreByPage(userCode);
        return AppResponse.success("查询成功！",getPageInfo(getStoreByPage));
    }
}
