package com.xzsd.app.appGoods.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.appGoods.dao.AppGoodsDao;
import com.xzsd.app.appGoods.entity.AppGoodsInfo;
import com.xzsd.app.appGoods.entity.EvaluatesInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @Description app商品实现类
 * @author jintian
 * @date 2020-04-23
 */
@Service
public class AppGoodsService {
    @Resource
    private AppGoodsDao appGoodsDao;
    /**
     * 商品详情（app）
     * @param goodsCode
     * @return
     * @author jintian
     * @date 2020-04-23
     */
    public AppResponse getGoods(String goodsCode){
        AppGoodsInfo appGoodsInfo = appGoodsDao.getGoods(goodsCode);
        return AppResponse.success("查询成功！",appGoodsInfo);
    }
    /**
     * 查询商品评价
     * @param
     * @return
     * @author jintian
     * @date 2020-04-24
     */
    public AppResponse listGoodsEvaluates(EvaluatesInfo evaluatesInfo){
        List<EvaluatesInfo> listEvaluatesByPage = appGoodsDao.listEvaluatesByPage(evaluatesInfo);
        return AppResponse.success("查询成功！",getPageInfo(listEvaluatesByPage));
    }

    /**
     *查询一级商品分类
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    public AppResponse listFirstGoodsSort(){
        List<AppGoodsInfo> appGoodsInfo = appGoodsDao.listFirstGoodsSort();
        return AppResponse.success("查询成功！",appGoodsInfo);
    }
    /**
     * 查询二级商品分类以及商品
     * @param
     * @return AppResponse
     * @author jintian
     * @date 2020-04-23
     */
    public AppResponse listGetGoodsSort(String sortCode){
        List<AppGoodsInfo> listGetSortByPage = appGoodsDao.listGetSortByPage(sortCode);
        return AppResponse.success("查询成功！",getPageInfo(listGetSortByPage));
    }
}
