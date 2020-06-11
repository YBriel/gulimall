package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.Coupon;
import com.muchi.gulimallcoupon.coupon.dao.CouponMapper;
import com.muchi.gulimallcoupon.coupon.service.ICouponService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 优惠券信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements ICouponService {

    @Override
    public  IPage<Coupon> findListByPage(Integer page, Integer pageCount){
        IPage<Coupon> wherePage = new Page<>(page, pageCount);
        Coupon where = new Coupon();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Coupon coupon){
        return baseMapper.insert(coupon);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Coupon coupon){
        return baseMapper.updateById(coupon);
    }

    @Override
    public Coupon findById(Long id){
        return  baseMapper.selectById(id);
    }
}
