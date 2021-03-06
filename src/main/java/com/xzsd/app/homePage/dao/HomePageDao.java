package com.xzsd.app.homePage.dao;

import com.xzsd.app.homePage.entity.HomePageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName homePageDao
 * @Description homePage
 * @author jintian
 * @date 2020-04-22
 */
@Mapper
public interface HomePageDao {
    /**
     * 查询轮播图
     * @param
     * @return
     */
    List<HomePageInfo> listRotationChartByPage();
    /**
     * 查询展示数量
     * @param
     * @return
     */
    int getShowNumber();
    /**
     * 查询热门商品
     * @param showNumber
     * @return
     */
    List<HomePageInfo> listHotGoodsByPage(@Param("showNumber")int showNumber);
}
