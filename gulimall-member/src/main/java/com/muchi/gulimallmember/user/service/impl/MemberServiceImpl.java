package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.Member;
import com.muchi.gulimallmember.user.dao.MemberMapper;
import com.muchi.gulimallmember.user.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

    @Override
    public  IPage<Member> findListByPage(Integer page, Integer pageCount){
        IPage<Member> wherePage = new Page<>(page, pageCount);
        Member where = new Member();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Member member){
        return baseMapper.insert(member);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Member member){
        return baseMapper.updateById(member);
    }

    @Override
    public Member findById(Long id){
        return  baseMapper.selectById(id);
    }
}
