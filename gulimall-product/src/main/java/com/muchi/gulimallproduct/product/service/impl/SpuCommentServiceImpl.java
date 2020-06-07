package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.SpuComment;
import com.muchi.gulimallproduct.product.dao.SpuCommentMapper;
import com.muchi.gulimallproduct.product.service.ISpuCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品评价 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentMapper, SpuComment> implements ISpuCommentService {

    @Override
    public  IPage<SpuComment> findListByPage(Integer page, Integer pageCount){
        IPage<SpuComment> wherePage = new Page<>(page, pageCount);
        SpuComment where = new SpuComment();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SpuComment spuComment){
        return baseMapper.insert(spuComment);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SpuComment spuComment){
        return baseMapper.updateById(spuComment);
    }

    @Override
    public SpuComment findById(Long id){
        return  baseMapper.selectById(id);
    }
}
