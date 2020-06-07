package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.AttrAttrgroupRelation;
import com.muchi.gulimallproduct.product.dao.AttrAttrgroupRelationMapper;
import com.muchi.gulimallproduct.product.service.IAttrAttrgroupRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 属性&属性分组关联 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationMapper, AttrAttrgroupRelation> implements IAttrAttrgroupRelationService {

    @Override
    public  IPage<AttrAttrgroupRelation> findListByPage(Integer page, Integer pageCount){
        IPage<AttrAttrgroupRelation> wherePage = new Page<>(page, pageCount);
        AttrAttrgroupRelation where = new AttrAttrgroupRelation();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(AttrAttrgroupRelation attrAttrgroupRelation){
        return baseMapper.insert(attrAttrgroupRelation);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(AttrAttrgroupRelation attrAttrgroupRelation){
        return baseMapper.updateById(attrAttrgroupRelation);
    }

    @Override
    public AttrAttrgroupRelation findById(Long id){
        return  baseMapper.selectById(id);
    }
}
