package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.SpuImages;
import com.muchi.gulimallproduct.product.dao.SpuImagesMapper;
import com.muchi.gulimallproduct.product.service.ISpuImagesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * spu图片 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesMapper, SpuImages> implements ISpuImagesService {

    @Override
    public  IPage<SpuImages> findListByPage(Integer page, Integer pageCount){
        IPage<SpuImages> wherePage = new Page<>(page, pageCount);
        SpuImages where = new SpuImages();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SpuImages spuImages){
        return baseMapper.insert(spuImages);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SpuImages spuImages){
        return baseMapper.updateById(spuImages);
    }

    @Override
    public SpuImages findById(Long id){
        return  baseMapper.selectById(id);
    }
}
