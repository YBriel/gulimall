package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.SeckillSession;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 秒杀活动场次 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface ISeckillSessionService extends IService<SeckillSession> {

    /**
     * 查询秒杀活动场次分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SeckillSession>
     */
    IPage<SeckillSession> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加秒杀活动场次
     *
     * @param seckillSession 秒杀活动场次
     * @return int
     */
    int add(SeckillSession seckillSession);

    /**
     * 删除秒杀活动场次
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改秒杀活动场次
     *
     * @param seckillSession 秒杀活动场次
     * @return int
     */
    int updateData(SeckillSession seckillSession);

    /**
     * id查询数据
     *
     * @param id id
     * @return SeckillSession
     */
    SeckillSession findById(Long id);
}
