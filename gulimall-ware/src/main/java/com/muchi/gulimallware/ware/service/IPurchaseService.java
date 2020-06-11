package com.muchi.gulimallware.ware.service;

import com.muchi.gulimallware.ware.entity.Purchase;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 采购信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IPurchaseService extends IService<Purchase> {

    /**
     * 查询采购信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Purchase>
     */
    IPage<Purchase> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加采购信息
     *
     * @param purchase 采购信息
     * @return int
     */
    int add(Purchase purchase);

    /**
     * 删除采购信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改采购信息
     *
     * @param purchase 采购信息
     * @return int
     */
    int updateData(Purchase purchase);

    /**
     * id查询数据
     *
     * @param id id
     * @return Purchase
     */
    Purchase findById(Long id);
}
