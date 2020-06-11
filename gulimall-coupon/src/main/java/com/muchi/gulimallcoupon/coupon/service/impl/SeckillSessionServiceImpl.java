package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.SeckillSession;
import com.muchi.gulimallcoupon.coupon.dao.SeckillSessionMapper;
import com.muchi.gulimallcoupon.coupon.service.ISeckillSessionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 秒杀活动场次 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionMapper, SeckillSession> implements ISeckillSessionService {

    @Override
    public  IPage<SeckillSession> findListByPage(Integer page, Integer pageCount){
        IPage<SeckillSession> wherePage = new Page<>(page, pageCount);
        SeckillSession where = new SeckillSession();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SeckillSession seckillSession){
        return baseMapper.insert(seckillSession);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SeckillSession seckillSession){
        return baseMapper.updateById(seckillSession);
    }

    @Override
    public SeckillSession findById(Long id){
        return  baseMapper.selectById(id);
    }
}
