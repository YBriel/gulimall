package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.IntegrationChangeHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 积分变化历史记录 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IIntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    /**
     * 查询积分变化历史记录分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<IntegrationChangeHistory>
     */
    IPage<IntegrationChangeHistory> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加积分变化历史记录
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return int
     */
    int add(IntegrationChangeHistory integrationChangeHistory);

    /**
     * 删除积分变化历史记录
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改积分变化历史记录
     *
     * @param integrationChangeHistory 积分变化历史记录
     * @return int
     */
    int updateData(IntegrationChangeHistory integrationChangeHistory);

    /**
     * id查询数据
     *
     * @param id id
     * @return IntegrationChangeHistory
     */
    IntegrationChangeHistory findById(Long id);
}
