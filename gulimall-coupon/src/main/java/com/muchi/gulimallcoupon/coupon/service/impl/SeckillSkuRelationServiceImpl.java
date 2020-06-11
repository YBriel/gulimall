package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.SeckillSkuRelation;
import com.muchi.gulimallcoupon.coupon.dao.SeckillSkuRelationMapper;
import com.muchi.gulimallcoupon.coupon.service.ISeckillSkuRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 秒杀活动商品关联 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationMapper, SeckillSkuRelation> implements ISeckillSkuRelationService {

    @Override
    public  IPage<SeckillSkuRelation> findListByPage(Integer page, Integer pageCount){
        IPage<SeckillSkuRelation> wherePage = new Page<>(page, pageCount);
        SeckillSkuRelation where = new SeckillSkuRelation();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SeckillSkuRelation seckillSkuRelation){
        return baseMapper.insert(seckillSkuRelation);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SeckillSkuRelation seckillSkuRelation){
        return baseMapper.updateById(seckillSkuRelation);
    }

    @Override
    public SeckillSkuRelation findById(Long id){
        return  baseMapper.selectById(id);
    }
}
