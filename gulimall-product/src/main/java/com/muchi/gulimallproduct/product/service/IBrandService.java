package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 品牌 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 查询品牌分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Brand>
     */
    IPage<Brand> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加品牌
     *
     * @param brand 品牌
     * @return int
     */
    int add(Brand brand);

    /**
     * 删除品牌
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改品牌
     *
     * @param brand 品牌
     * @return int
     */
    int updateData(Brand brand);

    /**
     * id查询数据
     *
     * @param id id
     * @return Brand
     */
    Brand findById(Long id);
}
