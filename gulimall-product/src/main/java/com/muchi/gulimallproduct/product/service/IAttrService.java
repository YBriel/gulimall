package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.Attr;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品属性 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface IAttrService extends IService<Attr> {

    /**
     * 查询商品属性分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Attr>
     */
    IPage<Attr> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品属性
     *
     * @param attr 商品属性
     * @return int
     */
    int add(Attr attr);

    /**
     * 删除商品属性
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品属性
     *
     * @param attr 商品属性
     * @return int
     */
    int updateData(Attr attr);

    /**
     * id查询数据
     *
     * @param id id
     * @return Attr
     */
    Attr findById(Long id);
}
