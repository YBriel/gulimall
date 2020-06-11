package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.SkuFullReduction;
import com.muchi.gulimallcoupon.coupon.dao.SkuFullReductionMapper;
import com.muchi.gulimallcoupon.coupon.service.ISkuFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品满减信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class SkuFullReductionServiceImpl extends ServiceImpl<SkuFullReductionMapper, SkuFullReduction> implements ISkuFullReductionService {

    @Override
    public  IPage<SkuFullReduction> findListByPage(Integer page, Integer pageCount){
        IPage<SkuFullReduction> wherePage = new Page<>(page, pageCount);
        SkuFullReduction where = new SkuFullReduction();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SkuFullReduction skuFullReduction){
        return baseMapper.insert(skuFullReduction);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SkuFullReduction skuFullReduction){
        return baseMapper.updateById(skuFullReduction);
    }

    @Override
    public SkuFullReduction findById(Long id){
        return  baseMapper.selectById(id);
    }
}
