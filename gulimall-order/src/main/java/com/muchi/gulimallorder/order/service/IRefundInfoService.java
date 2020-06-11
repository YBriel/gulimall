package com.muchi.gulimallorder.order.service;

import com.muchi.gulimallorder.order.entity.RefundInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 退款信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IRefundInfoService extends IService<RefundInfo> {

    /**
     * 查询退款信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<RefundInfo>
     */
    IPage<RefundInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加退款信息
     *
     * @param refundInfo 退款信息
     * @return int
     */
    int add(RefundInfo refundInfo);

    /**
     * 删除退款信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改退款信息
     *
     * @param refundInfo 退款信息
     * @return int
     */
    int updateData(RefundInfo refundInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return RefundInfo
     */
    RefundInfo findById(Long id);
}
