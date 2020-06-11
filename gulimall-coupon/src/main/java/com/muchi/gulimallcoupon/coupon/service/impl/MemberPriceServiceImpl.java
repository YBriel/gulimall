package com.muchi.gulimallcoupon.coupon.service.impl;

import com.muchi.gulimallcoupon.coupon.entity.MemberPrice;
import com.muchi.gulimallcoupon.coupon.dao.MemberPriceMapper;
import com.muchi.gulimallcoupon.coupon.service.IMemberPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品会员价格 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Service
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceMapper, MemberPrice> implements IMemberPriceService {

    @Override
    public  IPage<MemberPrice> findListByPage(Integer page, Integer pageCount){
        IPage<MemberPrice> wherePage = new Page<>(page, pageCount);
        MemberPrice where = new MemberPrice();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(MemberPrice memberPrice){
        return baseMapper.insert(memberPrice);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(MemberPrice memberPrice){
        return baseMapper.updateById(memberPrice);
    }

    @Override
    public MemberPrice findById(Long id){
        return  baseMapper.selectById(id);
    }
}
