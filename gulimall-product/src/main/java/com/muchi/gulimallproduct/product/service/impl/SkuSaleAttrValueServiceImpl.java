package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.SkuSaleAttrValue;
import com.muchi.gulimallproduct.product.dao.SkuSaleAttrValueMapper;
import com.muchi.gulimallproduct.product.service.ISkuSaleAttrValueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * sku销售属性&值 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueMapper, SkuSaleAttrValue> implements ISkuSaleAttrValueService {

    @Override
    public  IPage<SkuSaleAttrValue> findListByPage(Integer page, Integer pageCount){
        IPage<SkuSaleAttrValue> wherePage = new Page<>(page, pageCount);
        SkuSaleAttrValue where = new SkuSaleAttrValue();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SkuSaleAttrValue skuSaleAttrValue){
        return baseMapper.insert(skuSaleAttrValue);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SkuSaleAttrValue skuSaleAttrValue){
        return baseMapper.updateById(skuSaleAttrValue);
    }

    @Override
    public SkuSaleAttrValue findById(Long id){
        return  baseMapper.selectById(id);
    }
}
