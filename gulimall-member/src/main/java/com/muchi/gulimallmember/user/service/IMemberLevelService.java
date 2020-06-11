package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.MemberLevel;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 会员等级 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IMemberLevelService extends IService<MemberLevel> {

    /**
     * 查询会员等级分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<MemberLevel>
     */
    IPage<MemberLevel> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加会员等级
     *
     * @param memberLevel 会员等级
     * @return int
     */
    int add(MemberLevel memberLevel);

    /**
     * 删除会员等级
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改会员等级
     *
     * @param memberLevel 会员等级
     * @return int
     */
    int updateData(MemberLevel memberLevel);

    /**
     * id查询数据
     *
     * @param id id
     * @return MemberLevel
     */
    MemberLevel findById(Long id);
}
