package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.MemberLoginLog;
import com.muchi.gulimallmember.user.dao.MemberLoginLogMapper;
import com.muchi.gulimallmember.user.service.IMemberLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogMapper, MemberLoginLog> implements IMemberLoginLogService {

    @Override
    public  IPage<MemberLoginLog> findListByPage(Integer page, Integer pageCount){
        IPage<MemberLoginLog> wherePage = new Page<>(page, pageCount);
        MemberLoginLog where = new MemberLoginLog();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(MemberLoginLog memberLoginLog){
        return baseMapper.insert(memberLoginLog);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(MemberLoginLog memberLoginLog){
        return baseMapper.updateById(memberLoginLog);
    }

    @Override
    public MemberLoginLog findById(Long id){
        return  baseMapper.selectById(id);
    }
}
