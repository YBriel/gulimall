package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ICategoryService extends IService<Category> {

    /**
     * 查询商品三级分类分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Category>
     */
    IPage<Category> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品三级分类
     *
     * @param category 商品三级分类
     * @return int
     */
    int add(Category category);

    /**
     * 删除商品三级分类
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品三级分类
     *
     * @param category 商品三级分类
     * @return int
     */
    int updateData(Category category);

    /**
     * id查询数据
     *
     * @param id id
     * @return Category
     */
    Category findById(Long id);
}
