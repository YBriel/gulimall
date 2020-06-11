package com.muchi.gulimallware.ware.service.impl;

import com.muchi.gulimallware.ware.entity.WareOrderTask;
import com.muchi.gulimallware.ware.dao.WareOrderTaskMapper;
import com.muchi.gulimallware.ware.service.IWareOrderTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 库存工作单 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class WareOrderTaskServiceImpl extends ServiceImpl<WareOrderTaskMapper, WareOrderTask> implements IWareOrderTaskService {

    @Override
    public  IPage<WareOrderTask> findListByPage(Integer page, Integer pageCount){
        IPage<WareOrderTask> wherePage = new Page<>(page, pageCount);
        WareOrderTask where = new WareOrderTask();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(WareOrderTask wareOrderTask){
        return baseMapper.insert(wareOrderTask);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(WareOrderTask wareOrderTask){
        return baseMapper.updateById(wareOrderTask);
    }

    @Override
    public WareOrderTask findById(Long id){
        return  baseMapper.selectById(id);
    }
}
