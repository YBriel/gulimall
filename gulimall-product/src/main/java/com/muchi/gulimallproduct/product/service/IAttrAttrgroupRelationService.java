package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.AttrAttrgroupRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 属性&属性分组关联 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface IAttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    /**
     * 查询属性&属性分组关联分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<AttrAttrgroupRelation>
     */
    IPage<AttrAttrgroupRelation> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加属性&属性分组关联
     *
     * @param attrAttrgroupRelation 属性&属性分组关联
     * @return int
     */
    int add(AttrAttrgroupRelation attrAttrgroupRelation);

    /**
     * 删除属性&属性分组关联
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改属性&属性分组关联
     *
     * @param attrAttrgroupRelation 属性&属性分组关联
     * @return int
     */
    int updateData(AttrAttrgroupRelation attrAttrgroupRelation);

    /**
     * id查询数据
     *
     * @param id id
     * @return AttrAttrgroupRelation
     */
    AttrAttrgroupRelation findById(Long id);
}
