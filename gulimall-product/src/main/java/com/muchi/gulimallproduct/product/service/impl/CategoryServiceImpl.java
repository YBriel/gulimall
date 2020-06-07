package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.Category;
import com.muchi.gulimallproduct.product.dao.CategoryMapper;
import com.muchi.gulimallproduct.product.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Override
    public  IPage<Category> findListByPage(Integer page, Integer pageCount){
        IPage<Category> wherePage = new Page<>(page, pageCount);
        Category where = new Category();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Category category){
        return baseMapper.insert(category);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Category category){
        return baseMapper.updateById(category);
    }

    @Override
    public Category findById(Long id){
        return  baseMapper.selectById(id);
    }
}
