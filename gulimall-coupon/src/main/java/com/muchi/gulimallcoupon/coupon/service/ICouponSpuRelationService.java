package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.CouponSpuRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 优惠券与产品关联 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ICouponSpuRelationService extends IService<CouponSpuRelation> {

    /**
     * 查询优惠券与产品关联分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<CouponSpuRelation>
     */
    IPage<CouponSpuRelation> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加优惠券与产品关联
     *
     * @param couponSpuRelation 优惠券与产品关联
     * @return int
     */
    int add(CouponSpuRelation couponSpuRelation);

    /**
     * 删除优惠券与产品关联
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改优惠券与产品关联
     *
     * @param couponSpuRelation 优惠券与产品关联
     * @return int
     */
    int updateData(CouponSpuRelation couponSpuRelation);

    /**
     * id查询数据
     *
     * @param id id
     * @return CouponSpuRelation
     */
    CouponSpuRelation findById(Long id);
}
