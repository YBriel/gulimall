package com.muchi.gulimallorder.order.service;

import com.muchi.gulimallorder.order.entity.OrderItem;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 订单项信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IOrderItemService extends IService<OrderItem> {

    /**
     * 查询订单项信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<OrderItem>
     */
    IPage<OrderItem> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加订单项信息
     *
     * @param orderItem 订单项信息
     * @return int
     */
    int add(OrderItem orderItem);

    /**
     * 删除订单项信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改订单项信息
     *
     * @param orderItem 订单项信息
     * @return int
     */
    int updateData(OrderItem orderItem);

    /**
     * id查询数据
     *
     * @param id id
     * @return OrderItem
     */
    OrderItem findById(Long id);
}
