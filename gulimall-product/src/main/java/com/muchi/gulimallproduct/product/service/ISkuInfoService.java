package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.SkuInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * sku信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ISkuInfoService extends IService<SkuInfo> {

    /**
     * 查询sku信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SkuInfo>
     */
    IPage<SkuInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加sku信息
     *
     * @param skuInfo sku信息
     * @return int
     */
    int add(SkuInfo skuInfo);

    /**
     * 删除sku信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改sku信息
     *
     * @param skuInfo sku信息
     * @return int
     */
    int updateData(SkuInfo skuInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return SkuInfo
     */
    SkuInfo findById(Long id);
}
