package com.muchi.gulimallcoupon.coupon.service;

import com.muchi.gulimallcoupon.coupon.entity.MemberPrice;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品会员价格 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
public interface IMemberPriceService extends IService<MemberPrice> {

    /**
     * 查询商品会员价格分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<MemberPrice>
     */
    IPage<MemberPrice> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品会员价格
     *
     * @param memberPrice 商品会员价格
     * @return int
     */
    int add(MemberPrice memberPrice);

    /**
     * 删除商品会员价格
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品会员价格
     *
     * @param memberPrice 商品会员价格
     * @return int
     */
    int updateData(MemberPrice memberPrice);

    /**
     * id查询数据
     *
     * @param id id
     * @return MemberPrice
     */
    MemberPrice findById(Long id);
}
