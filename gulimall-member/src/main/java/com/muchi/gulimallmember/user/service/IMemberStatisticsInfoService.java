package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.MemberStatisticsInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 会员统计信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IMemberStatisticsInfoService extends IService<MemberStatisticsInfo> {

    /**
     * 查询会员统计信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<MemberStatisticsInfo>
     */
    IPage<MemberStatisticsInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加会员统计信息
     *
     * @param memberStatisticsInfo 会员统计信息
     * @return int
     */
    int add(MemberStatisticsInfo memberStatisticsInfo);

    /**
     * 删除会员统计信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改会员统计信息
     *
     * @param memberStatisticsInfo 会员统计信息
     * @return int
     */
    int updateData(MemberStatisticsInfo memberStatisticsInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return MemberStatisticsInfo
     */
    MemberStatisticsInfo findById(Long id);
}
