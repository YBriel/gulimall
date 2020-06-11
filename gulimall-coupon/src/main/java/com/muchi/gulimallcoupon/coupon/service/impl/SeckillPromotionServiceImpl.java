package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.SeckillPromotion;
import com.muchi.gulimallcoupon.coupon.dao.SeckillPromotionMapper;
import com.muchi.gulimallcoupon.coupon.service.ISeckillPromotionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 秒杀活动 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionMapper, SeckillPromotion> implements ISeckillPromotionService {

    @Override
    public  IPage<SeckillPromotion> findListByPage(Integer page, Integer pageCount){
        IPage<SeckillPromotion> wherePage = new Page<>(page, pageCount);
        SeckillPromotion where = new SeckillPromotion();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SeckillPromotion seckillPromotion){
        return baseMapper.insert(seckillPromotion);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SeckillPromotion seckillPromotion){
        return baseMapper.updateById(seckillPromotion);
    }

    @Override
    public SeckillPromotion findById(Long id){
        return  baseMapper.selectById(id);
    }
}
