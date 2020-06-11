package com.muchi.gulimallware.ware.service.impl;

import com.muchi.gulimallware.ware.entity.WareOrderTaskDetail;
import com.muchi.gulimallware.ware.dao.WareOrderTaskDetailMapper;
import com.muchi.gulimallware.ware.service.IWareOrderTaskDetailService;
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
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailMapper, WareOrderTaskDetail> implements IWareOrderTaskDetailService {

    @Override
    public  IPage<WareOrderTaskDetail> findListByPage(Integer page, Integer pageCount){
        IPage<WareOrderTaskDetail> wherePage = new Page<>(page, pageCount);
        WareOrderTaskDetail where = new WareOrderTaskDetail();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(WareOrderTaskDetail wareOrderTaskDetail){
        return baseMapper.insert(wareOrderTaskDetail);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(WareOrderTaskDetail wareOrderTaskDetail){
        return baseMapper.updateById(wareOrderTaskDetail);
    }

    @Override
    public WareOrderTaskDetail findById(Long id){
        return  baseMapper.selectById(id);
    }
}
