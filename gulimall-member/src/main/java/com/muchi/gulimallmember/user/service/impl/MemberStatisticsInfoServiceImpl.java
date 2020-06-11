package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.MemberStatisticsInfo;
import com.muchi.gulimallmember.user.dao.MemberStatisticsInfoMapper;
import com.muchi.gulimallmember.user.service.IMemberStatisticsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 会员统计信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoMapper, MemberStatisticsInfo> implements IMemberStatisticsInfoService {

    @Override
    public  IPage<MemberStatisticsInfo> findListByPage(Integer page, Integer pageCount){
        IPage<MemberStatisticsInfo> wherePage = new Page<>(page, pageCount);
        MemberStatisticsInfo where = new MemberStatisticsInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(MemberStatisticsInfo memberStatisticsInfo){
        return baseMapper.insert(memberStatisticsInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(MemberStatisticsInfo memberStatisticsInfo){
        return baseMapper.updateById(memberStatisticsInfo);
    }

    @Override
    public MemberStatisticsInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
