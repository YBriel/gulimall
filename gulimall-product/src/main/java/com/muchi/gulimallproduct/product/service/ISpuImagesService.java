package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.SpuImages;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * spu图片 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ISpuImagesService extends IService<SpuImages> {

    /**
     * 查询spu图片分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SpuImages>
     */
    IPage<SpuImages> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加spu图片
     *
     * @param spuImages spu图片
     * @return int
     */
    int add(SpuImages spuImages);

    /**
     * 删除spu图片
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改spu图片
     *
     * @param spuImages spu图片
     * @return int
     */
    int updateData(SpuImages spuImages);

    /**
     * id查询数据
     *
     * @param id id
     * @return SpuImages
     */
    SpuImages findById(Long id);
}
