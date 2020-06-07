package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.Brand;
import com.muchi.gulimallproduct.product.dao.BrandMapper;
import com.muchi.gulimallproduct.product.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 品牌 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Override
    public  IPage<Brand> findListByPage(Integer page, Integer pageCount){
        IPage<Brand> wherePage = new Page<>(page, pageCount);
        Brand where = new Brand();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Brand brand){
        return baseMapper.insert(brand);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Brand brand){
        return baseMapper.updateById(brand);
    }

    @Override
    public Brand findById(Long id){
        return  baseMapper.selectById(id);
    }
}
