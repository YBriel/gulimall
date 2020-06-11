package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.MemberCollectSpu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 会员收藏的商品 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IMemberCollectSpuService extends IService<MemberCollectSpu> {

    /**
     * 查询会员收藏的商品分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<MemberCollectSpu>
     */
    IPage<MemberCollectSpu> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加会员收藏的商品
     *
     * @param memberCollectSpu 会员收藏的商品
     * @return int
     */
    int add(MemberCollectSpu memberCollectSpu);

    /**
     * 删除会员收藏的商品
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改会员收藏的商品
     *
     * @param memberCollectSpu 会员收藏的商品
     * @return int
     */
    int updateData(MemberCollectSpu memberCollectSpu);

    /**
     * id查询数据
     *
     * @param id id
     * @return MemberCollectSpu
     */
    MemberCollectSpu findById(Long id);
}
