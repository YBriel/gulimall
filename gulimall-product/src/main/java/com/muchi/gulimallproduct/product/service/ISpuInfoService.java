package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.SpuInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * spu信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ISpuInfoService extends IService<SpuInfo> {

    /**
     * 查询spu信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SpuInfo>
     */
    IPage<SpuInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加spu信息
     *
     * @param spuInfo spu信息
     * @return int
     */
    int add(SpuInfo spuInfo);

    /**
     * 删除spu信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改spu信息
     *
     * @param spuInfo spu信息
     * @return int
     */
    int updateData(SpuInfo spuInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return SpuInfo
     */
    SpuInfo findById(Long id);
}
