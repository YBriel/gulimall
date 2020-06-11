package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.HomeSubject;
import com.muchi.gulimallcoupon.coupon.dao.HomeSubjectMapper;
import com.muchi.gulimallcoupon.coupon.service.IHomeSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectMapper, HomeSubject> implements IHomeSubjectService {

    @Override
    public  IPage<HomeSubject> findListByPage(Integer page, Integer pageCount){
        IPage<HomeSubject> wherePage = new Page<>(page, pageCount);
        HomeSubject where = new HomeSubject();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(HomeSubject homeSubject){
        return baseMapper.insert(homeSubject);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(HomeSubject homeSubject){
        return baseMapper.updateById(homeSubject);
    }

    @Override
    public HomeSubject findById(Long id){
        return  baseMapper.selectById(id);
    }
}
