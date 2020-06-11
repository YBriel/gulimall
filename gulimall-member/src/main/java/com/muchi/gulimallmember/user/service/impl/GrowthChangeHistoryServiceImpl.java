package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.GrowthChangeHistory;
import com.muchi.gulimallmember.user.dao.GrowthChangeHistoryMapper;
import com.muchi.gulimallmember.user.service.IGrowthChangeHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 成长值变化历史记录 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryMapper, GrowthChangeHistory> implements IGrowthChangeHistoryService {

    @Override
    public  IPage<GrowthChangeHistory> findListByPage(Integer page, Integer pageCount){
        IPage<GrowthChangeHistory> wherePage = new Page<>(page, pageCount);
        GrowthChangeHistory where = new GrowthChangeHistory();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(GrowthChangeHistory growthChangeHistory){
        return baseMapper.insert(growthChangeHistory);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(GrowthChangeHistory growthChangeHistory){
        return baseMapper.updateById(growthChangeHistory);
    }

    @Override
    public GrowthChangeHistory findById(Long id){
        return  baseMapper.selectById(id);
    }
}
