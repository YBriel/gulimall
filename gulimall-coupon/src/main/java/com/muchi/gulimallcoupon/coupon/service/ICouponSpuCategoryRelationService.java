package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.CouponSpuCategoryRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 优惠券分类关联 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ICouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelation> {

    /**
     * 查询优惠券分类关联分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<CouponSpuCategoryRelation>
     */
    IPage<CouponSpuCategoryRelation> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加优惠券分类关联
     *
     * @param couponSpuCategoryRelation 优惠券分类关联
     * @return int
     */
    int add(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * 删除优惠券分类关联
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改优惠券分类关联
     *
     * @param couponSpuCategoryRelation 优惠券分类关联
     * @return int
     */
    int updateData(CouponSpuCategoryRelation couponSpuCategoryRelation);

    /**
     * id查询数据
     *
     * @param id id
     * @return CouponSpuCategoryRelation
     */
    CouponSpuCategoryRelation findById(Long id);
}
