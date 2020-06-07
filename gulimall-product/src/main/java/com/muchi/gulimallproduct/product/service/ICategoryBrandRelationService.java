package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.CategoryBrandRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 品牌分类关联 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ICategoryBrandRelationService extends IService<CategoryBrandRelation> {

    /**
     * 查询品牌分类关联分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<CategoryBrandRelation>
     */
    IPage<CategoryBrandRelation> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加品牌分类关联
     *
     * @param categoryBrandRelation 品牌分类关联
     * @return int
     */
    int add(CategoryBrandRelation categoryBrandRelation);

    /**
     * 删除品牌分类关联
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改品牌分类关联
     *
     * @param categoryBrandRelation 品牌分类关联
     * @return int
     */
    int updateData(CategoryBrandRelation categoryBrandRelation);

    /**
     * id查询数据
     *
     * @param id id
     * @return CategoryBrandRelation
     */
    CategoryBrandRelation findById(Long id);
}
