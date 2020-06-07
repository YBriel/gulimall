package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.ProductAttrValue;
import com.muchi.gulimallproduct.product.dao.ProductAttrValueMapper;
import com.muchi.gulimallproduct.product.service.IProductAttrValueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * spu属性值 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueMapper, ProductAttrValue> implements IProductAttrValueService {

    @Override
    public  IPage<ProductAttrValue> findListByPage(Integer page, Integer pageCount){
        IPage<ProductAttrValue> wherePage = new Page<>(page, pageCount);
        ProductAttrValue where = new ProductAttrValue();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(ProductAttrValue productAttrValue){
        return baseMapper.insert(productAttrValue);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(ProductAttrValue productAttrValue){
        return baseMapper.updateById(productAttrValue);
    }

    @Override
    public ProductAttrValue findById(Long id){
        return  baseMapper.selectById(id);
    }
}
