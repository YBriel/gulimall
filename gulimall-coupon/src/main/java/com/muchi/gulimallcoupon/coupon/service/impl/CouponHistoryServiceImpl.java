package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.CouponHistory;
import com.muchi.gulimallcoupon.coupon.dao.CouponHistoryMapper;
import com.muchi.gulimallcoupon.coupon.service.ICouponHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 优惠券领取历史记录 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistory> implements ICouponHistoryService {

    @Override
    public  IPage<CouponHistory> findListByPage(Integer page, Integer pageCount){
        IPage<CouponHistory> wherePage = new Page<>(page, pageCount);
        CouponHistory where = new CouponHistory();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(CouponHistory couponHistory){
        return baseMapper.insert(couponHistory);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(CouponHistory couponHistory){
        return baseMapper.updateById(couponHistory);
    }

    @Override
    public CouponHistory findById(Long id){
        return  baseMapper.selectById(id);
    }
}
