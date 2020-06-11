package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.SeckillSkuNotice;
import com.muchi.gulimallcoupon.coupon.dao.SeckillSkuNoticeMapper;
import com.muchi.gulimallcoupon.coupon.service.ISeckillSkuNoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 秒杀商品通知订阅 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeMapper, SeckillSkuNotice> implements ISeckillSkuNoticeService {

    @Override
    public  IPage<SeckillSkuNotice> findListByPage(Integer page, Integer pageCount){
        IPage<SeckillSkuNotice> wherePage = new Page<>(page, pageCount);
        SeckillSkuNotice where = new SeckillSkuNotice();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SeckillSkuNotice seckillSkuNotice){
        return baseMapper.insert(seckillSkuNotice);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SeckillSkuNotice seckillSkuNotice){
        return baseMapper.updateById(seckillSkuNotice);
    }

    @Override
    public SeckillSkuNotice findById(Long id){
        return  baseMapper.selectById(id);
    }
}
