package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.OrderReturnApply;
import com.muchi.gulimallorder.order.dao.OrderReturnApplyMapper;
import com.muchi.gulimallorder.order.service.IOrderReturnApplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 订单退货申请 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyMapper, OrderReturnApply> implements IOrderReturnApplyService {

    @Override
    public  IPage<OrderReturnApply> findListByPage(Integer page, Integer pageCount){
        IPage<OrderReturnApply> wherePage = new Page<>(page, pageCount);
        OrderReturnApply where = new OrderReturnApply();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(OrderReturnApply orderReturnApply){
        return baseMapper.insert(orderReturnApply);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(OrderReturnApply orderReturnApply){
        return baseMapper.updateById(orderReturnApply);
    }

    @Override
    public OrderReturnApply findById(Long id){
        return  baseMapper.selectById(id);
    }
}
