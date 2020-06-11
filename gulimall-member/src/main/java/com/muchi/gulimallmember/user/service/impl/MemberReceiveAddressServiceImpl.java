package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.MemberReceiveAddress;
import com.muchi.gulimallmember.user.dao.MemberReceiveAddressMapper;
import com.muchi.gulimallmember.user.service.IMemberReceiveAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 会员收货地址 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressMapper, MemberReceiveAddress> implements IMemberReceiveAddressService {

    @Override
    public  IPage<MemberReceiveAddress> findListByPage(Integer page, Integer pageCount){
        IPage<MemberReceiveAddress> wherePage = new Page<>(page, pageCount);
        MemberReceiveAddress where = new MemberReceiveAddress();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(MemberReceiveAddress memberReceiveAddress){
        return baseMapper.insert(memberReceiveAddress);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(MemberReceiveAddress memberReceiveAddress){
        return baseMapper.updateById(memberReceiveAddress);
    }

    @Override
    public MemberReceiveAddress findById(Long id){
        return  baseMapper.selectById(id);
    }
}
