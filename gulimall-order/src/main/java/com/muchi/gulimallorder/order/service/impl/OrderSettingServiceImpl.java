package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.OrderSetting;
import com.muchi.gulimallorder.order.dao.OrderSettingMapper;
import com.muchi.gulimallorder.order.service.IOrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 订单配置信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements IOrderSettingService {

    @Override
    public  IPage<OrderSetting> findListByPage(Integer page, Integer pageCount){
        IPage<OrderSetting> wherePage = new Page<>(page, pageCount);
        OrderSetting where = new OrderSetting();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(OrderSetting orderSetting){
        return baseMapper.insert(orderSetting);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(OrderSetting orderSetting){
        return baseMapper.updateById(orderSetting);
    }

    @Override
    public OrderSetting findById(Long id){
        return  baseMapper.selectById(id);
    }
}
