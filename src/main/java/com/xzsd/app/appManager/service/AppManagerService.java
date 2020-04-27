package com.xzsd.app.appManager.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.appManager.dao.AppManagerDao;
import com.xzsd.app.appManager.entity.AppManagerInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @Description 店长订单实现类
 * @author jintian
 * @date 2020-04-25
 */
@Service
public class AppManagerService {
    @Resource
    private AppManagerDao appManagerDao;
    /**
     * 查询店长订单列表
     * @param appManagerInfo
     * @return
     * @author jintian
     * @date 2020-04-25
     */
    public AppResponse listManagerOrders(AppManagerInfo appManagerInfo){
        List<AppManagerInfo> listManagerOrderByPage = appManagerDao.listManagerOrderByPage(appManagerInfo);
        return AppResponse.success("查询成功!",getPageInfo(listManagerOrderByPage));
    }
    /**
     * 修改店长订单
     * @param appManagerInfo
     * @return
     * @author jintian
     * @date 2020-04-26
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateManagerOrderState(AppManagerInfo appManagerInfo){
        int count = appManagerDao.updateManagerOrderState(appManagerInfo);
        if(count == 0){
            return AppResponse.bizError("订单不存在或数据有变化，请重试！");
        }
        return AppResponse.success("修改成功！");
    }
    /**
     * 查询店长订单详情
     * @param orderCode
     * @return
     * @author jintian
     * @date 2020-04-26
     */
    public AppResponse listManagerOrderDetail(String orderCode){
        List<AppManagerInfo>listOrderDetailByPage = appManagerDao.listOrderDetailByPage(orderCode);
        return AppResponse.success("查询成功！",getPageInfo(listOrderDetailByPage));
    }
}
