package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.SpuInfoDesc;
import com.muchi.gulimallproduct.product.dao.SpuInfoDescMapper;
import com.muchi.gulimallproduct.product.service.ISpuInfoDescService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * spu信息介绍 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescMapper, SpuInfoDesc> implements ISpuInfoDescService {

    @Override
    public  IPage<SpuInfoDesc> findListByPage(Integer page, Integer pageCount){
        IPage<SpuInfoDesc> wherePage = new Page<>(page, pageCount);
        SpuInfoDesc where = new SpuInfoDesc();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SpuInfoDesc spuInfoDesc){
        return baseMapper.insert(spuInfoDesc);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SpuInfoDesc spuInfoDesc){
        return baseMapper.updateById(spuInfoDesc);
    }

    @Override
    public SpuInfoDesc findById(Long id){
        return  baseMapper.selectById(id);
    }
}
