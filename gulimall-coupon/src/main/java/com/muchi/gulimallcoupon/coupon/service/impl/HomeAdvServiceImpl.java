package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.HomeAdv;
import com.muchi.gulimallcoupon.coupon.dao.HomeAdvMapper;
import com.muchi.gulimallcoupon.coupon.service.IHomeAdvService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 首页轮播广告 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvMapper, HomeAdv> implements IHomeAdvService {

    @Override
    public  IPage<HomeAdv> findListByPage(Integer page, Integer pageCount){
        IPage<HomeAdv> wherePage = new Page<>(page, pageCount);
        HomeAdv where = new HomeAdv();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(HomeAdv homeAdv){
        return baseMapper.insert(homeAdv);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(HomeAdv homeAdv){
        return baseMapper.updateById(homeAdv);
    }

    @Override
    public HomeAdv findById(Long id){
        return  baseMapper.selectById(id);
    }
}
