package com.muchi.gulimallorder.order.service;

import com.muchi.gulimallorder.order.entity.OrderOperateHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 订单操作历史记录 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IOrderOperateHistoryService extends IService<OrderOperateHistory> {

    /**
     * 查询订单操作历史记录分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<OrderOperateHistory>
     */
    IPage<OrderOperateHistory> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加订单操作历史记录
     *
     * @param orderOperateHistory 订单操作历史记录
     * @return int
     */
    int add(OrderOperateHistory orderOperateHistory);

    /**
     * 删除订单操作历史记录
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改订单操作历史记录
     *
     * @param orderOperateHistory 订单操作历史记录
     * @return int
     */
    int updateData(OrderOperateHistory orderOperateHistory);

    /**
     * id查询数据
     *
     * @param id id
     * @return OrderOperateHistory
     */
    OrderOperateHistory findById(Long id);
}
