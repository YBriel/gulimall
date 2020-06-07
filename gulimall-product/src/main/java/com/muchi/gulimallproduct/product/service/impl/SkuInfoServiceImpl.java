package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.SkuInfo;
import com.muchi.gulimallproduct.product.dao.SkuInfoMapper;
import com.muchi.gulimallproduct.product.service.ISkuInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * sku信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoMapper, SkuInfo> implements ISkuInfoService {

    @Override
    public  IPage<SkuInfo> findListByPage(Integer page, Integer pageCount){
        IPage<SkuInfo> wherePage = new Page<>(page, pageCount);
        SkuInfo where = new SkuInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SkuInfo skuInfo){
        return baseMapper.insert(skuInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SkuInfo skuInfo){
        return baseMapper.updateById(skuInfo);
    }

    @Override
    public SkuInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
