package com.muchi.gulimallorder.order.service;

import com.muchi.gulimallorder.order.entity.PaymentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 支付信息表 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IPaymentInfoService extends IService<PaymentInfo> {

    /**
     * 查询支付信息表分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<PaymentInfo>
     */
    IPage<PaymentInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加支付信息表
     *
     * @param paymentInfo 支付信息表
     * @return int
     */
    int add(PaymentInfo paymentInfo);

    /**
     * 删除支付信息表
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改支付信息表
     *
     * @param paymentInfo 支付信息表
     * @return int
     */
    int updateData(PaymentInfo paymentInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return PaymentInfo
     */
    PaymentInfo findById(Long id);
}
