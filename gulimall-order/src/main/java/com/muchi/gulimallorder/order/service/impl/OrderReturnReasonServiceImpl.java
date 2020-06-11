package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.OrderReturnReason;
import com.muchi.gulimallorder.order.dao.OrderReturnReasonMapper;
import com.muchi.gulimallorder.order.service.IOrderReturnReasonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 退货原因 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReason> implements IOrderReturnReasonService {

    @Override
    public  IPage<OrderReturnReason> findListByPage(Integer page, Integer pageCount){
        IPage<OrderReturnReason> wherePage = new Page<>(page, pageCount);
        OrderReturnReason where = new OrderReturnReason();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(OrderReturnReason orderReturnReason){
        return baseMapper.insert(orderReturnReason);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(OrderReturnReason orderReturnReason){
        return baseMapper.updateById(orderReturnReason);
    }

    @Override
    public OrderReturnReason findById(Long id){
        return  baseMapper.selectById(id);
    }
}
