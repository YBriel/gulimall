package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.SkuImages;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * sku图片 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ISkuImagesService extends IService<SkuImages> {

    /**
     * 查询sku图片分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SkuImages>
     */
    IPage<SkuImages> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加sku图片
     *
     * @param skuImages sku图片
     * @return int
     */
    int add(SkuImages skuImages);

    /**
     * 删除sku图片
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改sku图片
     *
     * @param skuImages sku图片
     * @return int
     */
    int updateData(SkuImages skuImages);

    /**
     * id查询数据
     *
     * @param id id
     * @return SkuImages
     */
    SkuImages findById(Long id);
}
