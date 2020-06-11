package com.muchi.gulimallware.ware.service;

import com.muchi.gulimallware.ware.entity.PurchaseDetail;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IPurchaseDetailService extends IService<PurchaseDetail> {

    /**
     * 查询分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<PurchaseDetail>
     */
    IPage<PurchaseDetail> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加
     *
     * @param purchaseDetail 
     * @return int
     */
    int add(PurchaseDetail purchaseDetail);

    /**
     * 删除
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改
     *
     * @param purchaseDetail 
     * @return int
     */
    int updateData(PurchaseDetail purchaseDetail);

    /**
     * id查询数据
     *
     * @param id id
     * @return PurchaseDetail
     */
    PurchaseDetail findById(Long id);
}
