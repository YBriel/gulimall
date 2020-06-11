package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.OrderOperateHistory;
import com.muchi.gulimallorder.order.dao.OrderOperateHistoryMapper;
import com.muchi.gulimallorder.order.service.IOrderOperateHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements IOrderOperateHistoryService {

    @Override
    public  IPage<OrderOperateHistory> findListByPage(Integer page, Integer pageCount){
        IPage<OrderOperateHistory> wherePage = new Page<>(page, pageCount);
        OrderOperateHistory where = new OrderOperateHistory();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(OrderOperateHistory orderOperateHistory){
        return baseMapper.insert(orderOperateHistory);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(OrderOperateHistory orderOperateHistory){
        return baseMapper.updateById(orderOperateHistory);
    }

    @Override
    public OrderOperateHistory findById(Long id){
        return  baseMapper.selectById(id);
    }
}
