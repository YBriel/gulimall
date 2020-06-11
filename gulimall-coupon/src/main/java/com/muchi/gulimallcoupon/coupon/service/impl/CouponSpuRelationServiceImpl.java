package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.CouponSpuRelation;
import com.muchi.gulimallcoupon.coupon.dao.CouponSpuRelationMapper;
import com.muchi.gulimallcoupon.coupon.service.ICouponSpuRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 优惠券与产品关联 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationMapper, CouponSpuRelation> implements ICouponSpuRelationService {

    @Override
    public  IPage<CouponSpuRelation> findListByPage(Integer page, Integer pageCount){
        IPage<CouponSpuRelation> wherePage = new Page<>(page, pageCount);
        CouponSpuRelation where = new CouponSpuRelation();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(CouponSpuRelation couponSpuRelation){
        return baseMapper.insert(couponSpuRelation);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(CouponSpuRelation couponSpuRelation){
        return baseMapper.updateById(couponSpuRelation);
    }

    @Override
    public CouponSpuRelation findById(Long id){
        return  baseMapper.selectById(id);
    }
}
