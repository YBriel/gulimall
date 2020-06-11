package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.SkuFullReduction;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品满减信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ISkuFullReductionService extends IService<SkuFullReduction> {

    /**
     * 查询商品满减信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SkuFullReduction>
     */
    IPage<SkuFullReduction> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品满减信息
     *
     * @param skuFullReduction 商品满减信息
     * @return int
     */
    int add(SkuFullReduction skuFullReduction);

    /**
     * 删除商品满减信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品满减信息
     *
     * @param skuFullReduction 商品满减信息
     * @return int
     */
    int updateData(SkuFullReduction skuFullReduction);

    /**
     * id查询数据
     *
     * @param id id
     * @return SkuFullReduction
     */
    SkuFullReduction findById(Long id);
}
