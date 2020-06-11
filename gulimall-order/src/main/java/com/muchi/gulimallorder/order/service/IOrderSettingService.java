package com.muchi.gulimallorder.order.service;

import com.muchi.gulimallorder.order.entity.OrderSetting;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 订单配置信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IOrderSettingService extends IService<OrderSetting> {

    /**
     * 查询订单配置信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<OrderSetting>
     */
    IPage<OrderSetting> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加订单配置信息
     *
     * @param orderSetting 订单配置信息
     * @return int
     */
    int add(OrderSetting orderSetting);

    /**
     * 删除订单配置信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改订单配置信息
     *
     * @param orderSetting 订单配置信息
     * @return int
     */
    int updateData(OrderSetting orderSetting);

    /**
     * id查询数据
     *
     * @param id id
     * @return OrderSetting
     */
    OrderSetting findById(Long id);
}
