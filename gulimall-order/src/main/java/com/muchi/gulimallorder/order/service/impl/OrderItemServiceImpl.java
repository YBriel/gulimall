package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.OrderItem;
import com.muchi.gulimallorder.order.dao.OrderItemMapper;
import com.muchi.gulimallorder.order.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

    @Override
    public  IPage<OrderItem> findListByPage(Integer page, Integer pageCount){
        IPage<OrderItem> wherePage = new Page<>(page, pageCount);
        OrderItem where = new OrderItem();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(OrderItem orderItem){
        return baseMapper.insert(orderItem);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(OrderItem orderItem){
        return baseMapper.updateById(orderItem);
    }

    @Override
    public OrderItem findById(Long id){
        return  baseMapper.selectById(id);
    }
}
