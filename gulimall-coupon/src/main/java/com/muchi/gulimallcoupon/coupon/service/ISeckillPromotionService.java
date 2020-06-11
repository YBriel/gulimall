package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.SeckillPromotion;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 秒杀活动 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ISeckillPromotionService extends IService<SeckillPromotion> {

    /**
     * 查询秒杀活动分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SeckillPromotion>
     */
    IPage<SeckillPromotion> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加秒杀活动
     *
     * @param seckillPromotion 秒杀活动
     * @return int
     */
    int add(SeckillPromotion seckillPromotion);

    /**
     * 删除秒杀活动
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改秒杀活动
     *
     * @param seckillPromotion 秒杀活动
     * @return int
     */
    int updateData(SeckillPromotion seckillPromotion);

    /**
     * id查询数据
     *
     * @param id id
     * @return SeckillPromotion
     */
    SeckillPromotion findById(Long id);
}
