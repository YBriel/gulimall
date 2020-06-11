package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.SpuBounds;
import com.muchi.gulimallcoupon.coupon.dao.SpuBoundsMapper;
import com.muchi.gulimallcoupon.coupon.service.ISpuBoundsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品spu积分设置 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsMapper, SpuBounds> implements ISpuBoundsService {

    @Override
    public  IPage<SpuBounds> findListByPage(Integer page, Integer pageCount){
        IPage<SpuBounds> wherePage = new Page<>(page, pageCount);
        SpuBounds where = new SpuBounds();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SpuBounds spuBounds){
        return baseMapper.insert(spuBounds);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SpuBounds spuBounds){
        return baseMapper.updateById(spuBounds);
    }

    @Override
    public SpuBounds findById(Long id){
        return  baseMapper.selectById(id);
    }
}
