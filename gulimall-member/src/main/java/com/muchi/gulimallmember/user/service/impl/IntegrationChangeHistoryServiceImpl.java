package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.IntegrationChangeHistory;
import com.muchi.gulimallmember.user.dao.IntegrationChangeHistoryMapper;
import com.muchi.gulimallmember.user.service.IIntegrationChangeHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 积分变化历史记录 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistory> implements IIntegrationChangeHistoryService {

    @Override
    public  IPage<IntegrationChangeHistory> findListByPage(Integer page, Integer pageCount){
        IPage<IntegrationChangeHistory> wherePage = new Page<>(page, pageCount);
        IntegrationChangeHistory where = new IntegrationChangeHistory();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(IntegrationChangeHistory integrationChangeHistory){
        return baseMapper.insert(integrationChangeHistory);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(IntegrationChangeHistory integrationChangeHistory){
        return baseMapper.updateById(integrationChangeHistory);
    }

    @Override
    public IntegrationChangeHistory findById(Long id){
        return  baseMapper.selectById(id);
    }
}
