package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.SpuBounds;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品spu积分设置 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ISpuBoundsService extends IService<SpuBounds> {

    /**
     * 查询商品spu积分设置分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SpuBounds>
     */
    IPage<SpuBounds> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品spu积分设置
     *
     * @param spuBounds 商品spu积分设置
     * @return int
     */
    int add(SpuBounds spuBounds);

    /**
     * 删除商品spu积分设置
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品spu积分设置
     *
     * @param spuBounds 商品spu积分设置
     * @return int
     */
    int updateData(SpuBounds spuBounds);

    /**
     * id查询数据
     *
     * @param id id
     * @return SpuBounds
     */
    SpuBounds findById(Long id);
}
