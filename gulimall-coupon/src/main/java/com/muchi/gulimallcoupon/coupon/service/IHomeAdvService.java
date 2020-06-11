package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.HomeAdv;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 首页轮播广告 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface IHomeAdvService extends IService<HomeAdv> {

    /**
     * 查询首页轮播广告分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<HomeAdv>
     */
    IPage<HomeAdv> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加首页轮播广告
     *
     * @param homeAdv 首页轮播广告
     * @return int
     */
    int add(HomeAdv homeAdv);

    /**
     * 删除首页轮播广告
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改首页轮播广告
     *
     * @param homeAdv 首页轮播广告
     * @return int
     */
    int updateData(HomeAdv homeAdv);

    /**
     * id查询数据
     *
     * @param id id
     * @return HomeAdv
     */
    HomeAdv findById(Long id);
}
