package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.Coupon;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 优惠券信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ICouponService extends IService<Coupon> {

    /**
     * 查询优惠券信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Coupon>
     */
    IPage<Coupon> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加优惠券信息
     *
     * @param coupon 优惠券信息
     * @return int
     */
    int add(Coupon coupon);

    /**
     * 删除优惠券信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改优惠券信息
     *
     * @param coupon 优惠券信息
     * @return int
     */
    int updateData(Coupon coupon);

    /**
     * id查询数据
     *
     * @param id id
     * @return Coupon
     */
    Coupon findById(Long id);
}
