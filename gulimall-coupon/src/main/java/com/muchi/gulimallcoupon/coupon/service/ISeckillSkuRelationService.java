package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.SeckillSkuRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 秒杀活动商品关联 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ISeckillSkuRelationService extends IService<SeckillSkuRelation> {

    /**
     * 查询秒杀活动商品关联分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SeckillSkuRelation>
     */
    IPage<SeckillSkuRelation> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加秒杀活动商品关联
     *
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return int
     */
    int add(SeckillSkuRelation seckillSkuRelation);

    /**
     * 删除秒杀活动商品关联
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改秒杀活动商品关联
     *
     * @param seckillSkuRelation 秒杀活动商品关联
     * @return int
     */
    int updateData(SeckillSkuRelation seckillSkuRelation);

    /**
     * id查询数据
     *
     * @param id id
     * @return SeckillSkuRelation
     */
    SeckillSkuRelation findById(Long id);
}
