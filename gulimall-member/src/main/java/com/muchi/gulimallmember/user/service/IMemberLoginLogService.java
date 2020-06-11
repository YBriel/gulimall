package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.MemberLoginLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 会员登录记录 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IMemberLoginLogService extends IService<MemberLoginLog> {

    /**
     * 查询会员登录记录分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<MemberLoginLog>
     */
    IPage<MemberLoginLog> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加会员登录记录
     *
     * @param memberLoginLog 会员登录记录
     * @return int
     */
    int add(MemberLoginLog memberLoginLog);

    /**
     * 删除会员登录记录
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改会员登录记录
     *
     * @param memberLoginLog 会员登录记录
     * @return int
     */
    int updateData(MemberLoginLog memberLoginLog);

    /**
     * id查询数据
     *
     * @param id id
     * @return MemberLoginLog
     */
    MemberLoginLog findById(Long id);
}
