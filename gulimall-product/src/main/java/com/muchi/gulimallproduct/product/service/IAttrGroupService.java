package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.AttrGroup;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 属性分组 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface IAttrGroupService extends IService<AttrGroup> {

    /**
     * 查询属性分组分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<AttrGroup>
     */
    IPage<AttrGroup> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加属性分组
     *
     * @param attrGroup 属性分组
     * @return int
     */
    int add(AttrGroup attrGroup);

    /**
     * 删除属性分组
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改属性分组
     *
     * @param attrGroup 属性分组
     * @return int
     */
    int updateData(AttrGroup attrGroup);

    /**
     * id查询数据
     *
     * @param id id
     * @return AttrGroup
     */
    AttrGroup findById(Long id);
}
