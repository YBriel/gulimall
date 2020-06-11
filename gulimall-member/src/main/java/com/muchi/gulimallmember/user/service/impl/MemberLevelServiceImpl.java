package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.MemberLevel;
import com.muchi.gulimallmember.user.dao.MemberLevelMapper;
import com.muchi.gulimallmember.user.service.IMemberLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 会员等级 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements IMemberLevelService {

    @Override
    public  IPage<MemberLevel> findListByPage(Integer page, Integer pageCount){
        IPage<MemberLevel> wherePage = new Page<>(page, pageCount);
        MemberLevel where = new MemberLevel();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(MemberLevel memberLevel){
        return baseMapper.insert(memberLevel);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(MemberLevel memberLevel){
        return baseMapper.updateById(memberLevel);
    }

    @Override
    public MemberLevel findById(Long id){
        return  baseMapper.selectById(id);
    }
}
