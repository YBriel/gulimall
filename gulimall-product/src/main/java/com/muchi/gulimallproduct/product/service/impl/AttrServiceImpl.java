package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.Attr;
import com.muchi.gulimallproduct.product.dao.AttrMapper;
import com.muchi.gulimallproduct.product.service.IAttrService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品属性 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class AttrServiceImpl extends ServiceImpl<AttrMapper, Attr> implements IAttrService {

    @Override
    public  IPage<Attr> findListByPage(Integer page, Integer pageCount){
        IPage<Attr> wherePage = new Page<>(page, pageCount);
        Attr where = new Attr();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Attr attr){
        return baseMapper.insert(attr);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Attr attr){
        return baseMapper.updateById(attr);
    }

    @Override
    public Attr findById(Long id){
        return  baseMapper.selectById(id);
    }
}
