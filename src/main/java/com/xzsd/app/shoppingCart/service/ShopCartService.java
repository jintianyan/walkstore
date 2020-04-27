package com.xzsd.app.shoppingCart.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.StringUtil;
import com.xzsd.app.shoppingCart.dao.ShopCartDao;
import com.xzsd.app.shoppingCart.entity.ShopCartInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * @Description 购物车实现类
 * @author jintian
 * @date 2020-04-23
 */
@Service
public class ShopCartService {
    @Resource
    private ShopCartDao shopCartDao;
    /**
     * 新增购物车
     * @param shopCartInfo
     * @return
     * @author jintian
     * @date 2020-04-23
     */
    public AppResponse addShoppingCart(ShopCartInfo shopCartInfo){
        //校验商品库存
        int stock = shopCartDao.countStock(shopCartInfo);
        if(stock == 0){
            return AppResponse.bizError("商品已无库存，请重新挑选！");
        }
        if(stock < shopCartInfo.getBuyNumber()){
            return AppResponse.bizError("库存量不足，无法购买");
        }
        //校验商品是否存在
        int countGoods = shopCartDao.countGoods(shopCartInfo);
        if(countGoods != 0){
            //修改原有购物车的商品数量
            int updateNumber = shopCartDao.updateNumber(shopCartInfo);
            if(updateNumber == 0){
                return AppResponse.bizError("购物车有此商品，请前往添加数量！");
            }
            return AppResponse.success("新增成功！");
        }
        shopCartInfo.setShopCarCode(StringUtil.getCommonCode(2));
        //新增购物车商品
        int addShopCar = shopCartDao.addShopCar(shopCartInfo);
        if(addShopCar == 0){
            return AppResponse.bizError("新增失败，请重新输入！");
        }
        return AppResponse.success("新增成功！");
    }
    /**
     * 查询购物车列表
     * @param shopCartInfo
     * @return
     * @author jintian
     * @date 2020-04-23
     */
    public AppResponse listShoppingCarts(ShopCartInfo shopCartInfo){
        List<ShopCartInfo> listShopCartByPage = shopCartDao.listShopCartByPage(shopCartInfo);
        return AppResponse.success("查询成功！",getPageInfo(listShopCartByPage));
    }
    /**
     * 修改购物车
     * @param shopCartInfo
     * @return
     * @author jintian
     * @date 2020-04-23
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShoppingCart(ShopCartInfo shopCartInfo){
        //校验商品库存
        int stock = shopCartDao.countStock(shopCartInfo);
        if(stock == 0){
            return AppResponse.bizError("商品已无库存，请重新挑选！");
        }
        if(stock < shopCartInfo.getBuyNumber()){
            return AppResponse.bizError("库存量不足，无法增加");
        }
        //修改数量
        int count = shopCartDao.updateShoppingCart(shopCartInfo);
        if(count == 0){
            return AppResponse.bizError("修改失败，请稍后重试！");
        }
        return AppResponse.success("修改成功！");
    }
    /**
     * 删除购物车
     * @param
     * @return
     * @author jintian
     * @date 2020-04-23
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShoppingCart(String shopCarCode){
        List<String> listCode = Arrays.asList(shopCarCode.split(","));
        int count = shopCartDao.deleteShoppingCart(listCode);
        if(count == 0){
            return AppResponse.bizError("删除失败，请稍后重试！");
        }
        return AppResponse.success("删除成功！");
    }
}
