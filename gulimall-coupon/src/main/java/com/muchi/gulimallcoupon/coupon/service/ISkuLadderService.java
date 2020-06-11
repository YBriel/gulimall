package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.SkuLadder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品阶梯价格 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ISkuLadderService extends IService<SkuLadder> {

    /**
     * 查询商品阶梯价格分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SkuLadder>
     */
    IPage<SkuLadder> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品阶梯价格
     *
     * @param skuLadder 商品阶梯价格
     * @return int
     */
    int add(SkuLadder skuLadder);

    /**
     * 删除商品阶梯价格
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品阶梯价格
     *
     * @param skuLadder 商品阶梯价格
     * @return int
     */
    int updateData(SkuLadder skuLadder);

    /**
     * id查询数据
     *
     * @param id id
     * @return SkuLadder
     */
    SkuLadder findById(Long id);
}
