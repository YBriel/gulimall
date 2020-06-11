package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.MemberCollectSubject;
import com.muchi.gulimallmember.user.dao.MemberCollectSubjectMapper;
import com.muchi.gulimallmember.user.service.IMemberCollectSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 会员收藏的专题活动 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectMapper, MemberCollectSubject> implements IMemberCollectSubjectService {

    @Override
    public  IPage<MemberCollectSubject> findListByPage(Integer page, Integer pageCount){
        IPage<MemberCollectSubject> wherePage = new Page<>(page, pageCount);
        MemberCollectSubject where = new MemberCollectSubject();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(MemberCollectSubject memberCollectSubject){
        return baseMapper.insert(memberCollectSubject);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(MemberCollectSubject memberCollectSubject){
        return baseMapper.updateById(memberCollectSubject);
    }

    @Override
    public MemberCollectSubject findById(Long id){
        return  baseMapper.selectById(id);
    }
}
