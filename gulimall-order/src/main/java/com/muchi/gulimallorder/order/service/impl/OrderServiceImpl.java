package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.Order;
import com.muchi.gulimallorder.order.dao.OrderMapper;
import com.muchi.gulimallorder.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Override
    public  IPage<Order> findListByPage(Integer page, Integer pageCount){
        IPage<Order> wherePage = new Page<>(page, pageCount);
        Order where = new Order();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Order order){
        return baseMapper.insert(order);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Order order){
        return baseMapper.updateById(order);
    }

    @Override
    public Order findById(Long id){
        return  baseMapper.selectById(id);
    }
}
