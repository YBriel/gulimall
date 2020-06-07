package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.SkuSaleAttrValue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * sku销售属性&值 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ISkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    /**
     * 查询sku销售属性&值分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SkuSaleAttrValue>
     */
    IPage<SkuSaleAttrValue> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加sku销售属性&值
     *
     * @param skuSaleAttrValue sku销售属性&值
     * @return int
     */
    int add(SkuSaleAttrValue skuSaleAttrValue);

    /**
     * 删除sku销售属性&值
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改sku销售属性&值
     *
     * @param skuSaleAttrValue sku销售属性&值
     * @return int
     */
    int updateData(SkuSaleAttrValue skuSaleAttrValue);

    /**
     * id查询数据
     *
     * @param id id
     * @return SkuSaleAttrValue
     */
    SkuSaleAttrValue findById(Long id);
}
