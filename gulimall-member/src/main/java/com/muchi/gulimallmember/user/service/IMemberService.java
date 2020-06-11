package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 会员 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IMemberService extends IService<Member> {

    /**
     * 查询会员分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<Member>
     */
    IPage<Member> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加会员
     *
     * @param member 会员
     * @return int
     */
    int add(Member member);

    /**
     * 删除会员
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改会员
     *
     * @param member 会员
     * @return int
     */
    int updateData(Member member);

    /**
     * id查询数据
     *
     * @param id id
     * @return Member
     */
    Member findById(Long id);
}
