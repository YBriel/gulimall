package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.HomeSubjectSpu;
import com.muchi.gulimallcoupon.coupon.dao.HomeSubjectSpuMapper;
import com.muchi.gulimallcoupon.coupon.service.IHomeSubjectSpuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 专题商品 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuMapper, HomeSubjectSpu> implements IHomeSubjectSpuService {

    @Override
    public  IPage<HomeSubjectSpu> findListByPage(Integer page, Integer pageCount){
        IPage<HomeSubjectSpu> wherePage = new Page<>(page, pageCount);
        HomeSubjectSpu where = new HomeSubjectSpu();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(HomeSubjectSpu homeSubjectSpu){
        return baseMapper.insert(homeSubjectSpu);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(HomeSubjectSpu homeSubjectSpu){
        return baseMapper.updateById(homeSubjectSpu);
    }

    @Override
    public HomeSubjectSpu findById(Long id){
        return  baseMapper.selectById(id);
    }
}
