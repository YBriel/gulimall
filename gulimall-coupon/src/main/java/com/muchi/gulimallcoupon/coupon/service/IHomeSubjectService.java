package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.HomeSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface IHomeSubjectService extends IService<HomeSubject> {

    /**
     * 查询首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<HomeSubject>
     */
    IPage<HomeSubject> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
     *
     * @param homeSubject 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
     * @return int
     */
    int add(HomeSubject homeSubject);

    /**
     * 删除首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
     *
     * @param homeSubject 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
     * @return int
     */
    int updateData(HomeSubject homeSubject);

    /**
     * id查询数据
     *
     * @param id id
     * @return HomeSubject
     */
    HomeSubject findById(Long id);
}
