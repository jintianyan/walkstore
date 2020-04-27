package com.xzsd.app.homePage.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.homePage.dao.HomePageDao;
import com.xzsd.app.homePage.entity.HomePageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @Description app首页实现类
 * @author jintian
 * @date 2020-04-22
 */
@Service
public class HomePageService {
    @Resource
    private HomePageDao homePageDao;
    /**
     * 查询轮播图
     * @param
     * @return
     */
    public AppResponse listRotationChartHome(){
        List<HomePageInfo> listRotationChartByPage = homePageDao.listRotationChartByPage();
        return AppResponse.success("查询成功！",getPageInfo(listRotationChartByPage));
    }
    /**
     * 查询热门商品
     * @param
     * @return
     */
    public AppResponse listHotGoods(){
        //查询展示数量
        int showNumber = homePageDao.getShowNumber();
        List<HomePageInfo> listHotGoodsByPage = homePageDao.listHotGoodsByPage(showNumber);
        return AppResponse.success("查询成功！",getPageInfo(listHotGoodsByPage));
    }
}
