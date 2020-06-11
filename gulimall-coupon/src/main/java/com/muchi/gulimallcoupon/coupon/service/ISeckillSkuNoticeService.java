package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.SeckillSkuNotice;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 秒杀商品通知订阅 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ISeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    /**
     * 查询秒杀商品通知订阅分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SeckillSkuNotice>
     */
    IPage<SeckillSkuNotice> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加秒杀商品通知订阅
     *
     * @param seckillSkuNotice 秒杀商品通知订阅
     * @return int
     */
    int add(SeckillSkuNotice seckillSkuNotice);

    /**
     * 删除秒杀商品通知订阅
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改秒杀商品通知订阅
     *
     * @param seckillSkuNotice 秒杀商品通知订阅
     * @return int
     */
    int updateData(SeckillSkuNotice seckillSkuNotice);

    /**
     * id查询数据
     *
     * @param id id
     * @return SeckillSkuNotice
     */
    SeckillSkuNotice findById(Long id);
}
