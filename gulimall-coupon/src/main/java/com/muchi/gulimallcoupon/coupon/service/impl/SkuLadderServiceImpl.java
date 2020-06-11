package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.SkuLadder;
import com.muchi.gulimallcoupon.coupon.dao.SkuLadderMapper;
import com.muchi.gulimallcoupon.coupon.service.ISkuLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品阶梯价格 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderMapper, SkuLadder> implements ISkuLadderService {

    @Override
    public  IPage<SkuLadder> findListByPage(Integer page, Integer pageCount){
        IPage<SkuLadder> wherePage = new Page<>(page, pageCount);
        SkuLadder where = new SkuLadder();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SkuLadder skuLadder){
        return baseMapper.insert(skuLadder);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SkuLadder skuLadder){
        return baseMapper.updateById(skuLadder);
    }

    @Override
    public SkuLadder findById(Long id){
        return  baseMapper.selectById(id);
    }
}
