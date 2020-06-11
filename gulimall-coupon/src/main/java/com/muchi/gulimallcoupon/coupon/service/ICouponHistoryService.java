package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.CouponHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 优惠券领取历史记录 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ICouponHistoryService extends IService<CouponHistory> {

    /**
     * 查询优惠券领取历史记录分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<CouponHistory>
     */
    IPage<CouponHistory> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加优惠券领取历史记录
     *
     * @param couponHistory 优惠券领取历史记录
     * @return int
     */
    int add(CouponHistory couponHistory);

    /**
     * 删除优惠券领取历史记录
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改优惠券领取历史记录
     *
     * @param couponHistory 优惠券领取历史记录
     * @return int
     */
    int updateData(CouponHistory couponHistory);

    /**
     * id查询数据
     *
     * @param id id
     * @return CouponHistory
     */
    CouponHistory findById(Long id);
}
