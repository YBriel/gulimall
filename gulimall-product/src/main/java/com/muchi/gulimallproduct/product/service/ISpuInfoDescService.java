package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.SpuInfoDesc;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * spu信息介绍 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ISpuInfoDescService extends IService<SpuInfoDesc> {

    /**
     * 查询spu信息介绍分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SpuInfoDesc>
     */
    IPage<SpuInfoDesc> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加spu信息介绍
     *
     * @param spuInfoDesc spu信息介绍
     * @return int
     */
    int add(SpuInfoDesc spuInfoDesc);

    /**
     * 删除spu信息介绍
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改spu信息介绍
     *
     * @param spuInfoDesc spu信息介绍
     * @return int
     */
    int updateData(SpuInfoDesc spuInfoDesc);

    /**
     * id查询数据
     *
     * @param id id
     * @return SpuInfoDesc
     */
    SpuInfoDesc findById(Long id);
}
