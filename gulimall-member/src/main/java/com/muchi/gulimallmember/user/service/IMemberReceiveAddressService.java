package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.MemberReceiveAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 会员收货地址 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IMemberReceiveAddressService extends IService<MemberReceiveAddress> {

    /**
     * 查询会员收货地址分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<MemberReceiveAddress>
     */
    IPage<MemberReceiveAddress> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加会员收货地址
     *
     * @param memberReceiveAddress 会员收货地址
     * @return int
     */
    int add(MemberReceiveAddress memberReceiveAddress);

    /**
     * 删除会员收货地址
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改会员收货地址
     *
     * @param memberReceiveAddress 会员收货地址
     * @return int
     */
    int updateData(MemberReceiveAddress memberReceiveAddress);

    /**
     * id查询数据
     *
     * @param id id
     * @return MemberReceiveAddress
     */
    MemberReceiveAddress findById(Long id);
}
