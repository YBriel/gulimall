package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.CommentReplay;
import com.muchi.gulimallproduct.product.dao.CommentReplayMapper;
import com.muchi.gulimallproduct.product.service.ICommentReplayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品评价回复关系 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplay> implements ICommentReplayService {

    @Override
    public  IPage<CommentReplay> findListByPage(Integer page, Integer pageCount){
        IPage<CommentReplay> wherePage = new Page<>(page, pageCount);
        CommentReplay where = new CommentReplay();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(CommentReplay commentReplay){
        return baseMapper.insert(commentReplay);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(CommentReplay commentReplay){
        return baseMapper.updateById(commentReplay);
    }

    @Override
    public CommentReplay findById(Long id){
        return  baseMapper.selectById(id);
    }
}
