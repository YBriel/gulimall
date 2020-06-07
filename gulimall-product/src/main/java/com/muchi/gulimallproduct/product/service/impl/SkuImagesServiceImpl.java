package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.SkuImages;
import com.muchi.gulimallproduct.product.dao.SkuImagesMapper;
import com.muchi.gulimallproduct.product.service.ISkuImagesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * sku图片 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesMapper, SkuImages> implements ISkuImagesService {

    @Override
    public  IPage<SkuImages> findListByPage(Integer page, Integer pageCount){
        IPage<SkuImages> wherePage = new Page<>(page, pageCount);
        SkuImages where = new SkuImages();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SkuImages skuImages){
        return baseMapper.insert(skuImages);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SkuImages skuImages){
        return baseMapper.updateById(skuImages);
    }

    @Override
    public SkuImages findById(Long id){
        return  baseMapper.selectById(id);
    }
}
