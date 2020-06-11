package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.HomeSubjectSpu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 专题商品 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface IHomeSubjectSpuService extends IService<HomeSubjectSpu> {

    /**
     * 查询专题商品分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<HomeSubjectSpu>
     */
    IPage<HomeSubjectSpu> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加专题商品
     *
     * @param homeSubjectSpu 专题商品
     * @return int
     */
    int add(HomeSubjectSpu homeSubjectSpu);

    /**
     * 删除专题商品
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改专题商品
     *
     * @param homeSubjectSpu 专题商品
     * @return int
     */
    int updateData(HomeSubjectSpu homeSubjectSpu);

    /**
     * id查询数据
     *
     * @param id id
     * @return HomeSubjectSpu
     */
    HomeSubjectSpu findById(Long id);
}
