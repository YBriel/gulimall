package com.muchi.gulimallorder.order.service;

import com.muchi.gulimallorder.order.entity.OrderReturnApply;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 订单退货申请 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IOrderReturnApplyService extends IService<OrderReturnApply> {

    /**
     * 查询订单退货申请分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<OrderReturnApply>
     */
    IPage<OrderReturnApply> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加订单退货申请
     *
     * @param orderReturnApply 订单退货申请
     * @return int
     */
    int add(OrderReturnApply orderReturnApply);

    /**
     * 删除订单退货申请
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改订单退货申请
     *
     * @param orderReturnApply 订单退货申请
     * @return int
     */
    int updateData(OrderReturnApply orderReturnApply);

    /**
     * id查询数据
     *
     * @param id id
     * @return OrderReturnApply
     */
    OrderReturnApply findById(Long id);
}
