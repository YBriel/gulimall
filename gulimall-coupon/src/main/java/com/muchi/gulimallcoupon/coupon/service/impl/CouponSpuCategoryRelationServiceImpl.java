package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.CouponSpuCategoryRelation;
import com.muchi.gulimallcoupon.coupon.dao.CouponSpuCategoryRelationMapper;
import com.muchi.gulimallcoupon.coupon.service.ICouponSpuCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 优惠券分类关联 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationMapper, CouponSpuCategoryRelation> implements ICouponSpuCategoryRelationService {

    @Override
    public  IPage<CouponSpuCategoryRelation> findListByPage(Integer page, Integer pageCount){
        IPage<CouponSpuCategoryRelation> wherePage = new Page<>(page, pageCount);
        CouponSpuCategoryRelation where = new CouponSpuCategoryRelation();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(CouponSpuCategoryRelation couponSpuCategoryRelation){
        return baseMapper.insert(couponSpuCategoryRelation);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(CouponSpuCategoryRelation couponSpuCategoryRelation){
        return baseMapper.updateById(couponSpuCategoryRelation);
    }

    @Override
    public CouponSpuCategoryRelation findById(Long id){
        return  baseMapper.selectById(id);
    }
}
