package com.muchi.gulimallorder.order.service;

import com.muchi.gulimallorder.order.entity.OrderReturnReason;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 退货原因 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IOrderReturnReasonService extends IService<OrderReturnReason> {

    /**
     * 查询退货原因分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<OrderReturnReason>
     */
    IPage<OrderReturnReason> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加退货原因
     *
     * @param orderReturnReason 退货原因
     * @return int
     */
    int add(OrderReturnReason orderReturnReason);

    /**
     * 删除退货原因
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改退货原因
     *
     * @param orderReturnReason 退货原因
     * @return int
     */
    int updateData(OrderReturnReason orderReturnReason);

    /**
     * id查询数据
     *
     * @param id id
     * @return OrderReturnReason
     */
    OrderReturnReason findById(Long id);
}
