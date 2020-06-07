package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.ProductAttrValue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * spu属性值 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface IProductAttrValueService extends IService<ProductAttrValue> {

    /**
     * 查询spu属性值分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<ProductAttrValue>
     */
    IPage<ProductAttrValue> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加spu属性值
     *
     * @param productAttrValue spu属性值
     * @return int
     */
    int add(ProductAttrValue productAttrValue);

    /**
     * 删除spu属性值
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改spu属性值
     *
     * @param productAttrValue spu属性值
     * @return int
     */
    int updateData(ProductAttrValue productAttrValue);

    /**
     * id查询数据
     *
     * @param id id
     * @return ProductAttrValue
     */
    ProductAttrValue findById(Long id);
}
