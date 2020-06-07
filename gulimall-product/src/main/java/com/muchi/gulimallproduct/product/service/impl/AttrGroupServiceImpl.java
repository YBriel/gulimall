package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.AttrGroup;
import com.muchi.gulimallproduct.product.dao.AttrGroupMapper;
import com.muchi.gulimallproduct.product.service.IAttrGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 属性分组 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupMapper, AttrGroup> implements IAttrGroupService {

    @Override
    public  IPage<AttrGroup> findListByPage(Integer page, Integer pageCount){
        IPage<AttrGroup> wherePage = new Page<>(page, pageCount);
        AttrGroup where = new AttrGroup();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(AttrGroup attrGroup){
        return baseMapper.insert(attrGroup);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(AttrGroup attrGroup){
        return baseMapper.updateById(attrGroup);
    }

    @Override
    public AttrGroup findById(Long id){
        return  baseMapper.selectById(id);
    }
}
