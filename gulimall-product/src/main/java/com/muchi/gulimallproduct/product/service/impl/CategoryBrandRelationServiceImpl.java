package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.CategoryBrandRelation;
import com.muchi.gulimallproduct.product.dao.CategoryBrandRelationMapper;
import com.muchi.gulimallproduct.product.service.ICategoryBrandRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 品牌分类关联 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class CategoryBrandRelationServiceImpl extends ServiceImpl<CategoryBrandRelationMapper, CategoryBrandRelation> implements ICategoryBrandRelationService {

    @Override
    public  IPage<CategoryBrandRelation> findListByPage(Integer page, Integer pageCount){
        IPage<CategoryBrandRelation> wherePage = new Page<>(page, pageCount);
        CategoryBrandRelation where = new CategoryBrandRelation();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(CategoryBrandRelation categoryBrandRelation){
        return baseMapper.insert(categoryBrandRelation);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(CategoryBrandRelation categoryBrandRelation){
        return baseMapper.updateById(categoryBrandRelation);
    }

    @Override
    public CategoryBrandRelation findById(Long id){
        return  baseMapper.selectById(id);
    }
}
