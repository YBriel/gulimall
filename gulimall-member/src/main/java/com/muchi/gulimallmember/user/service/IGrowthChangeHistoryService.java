package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.GrowthChangeHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 成长值变化历史记录 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IGrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    /**
     * 查询成长值变化历史记录分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<GrowthChangeHistory>
     */
    IPage<GrowthChangeHistory> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加成长值变化历史记录
     *
     * @param growthChangeHistory 成长值变化历史记录
     * @return int
     */
    int add(GrowthChangeHistory growthChangeHistory);

    /**
     * 删除成长值变化历史记录
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改成长值变化历史记录
     *
     * @param growthChangeHistory 成长值变化历史记录
     * @return int
     */
    int updateData(GrowthChangeHistory growthChangeHistory);

    /**
     * id查询数据
     *
     * @param id id
     * @return GrowthChangeHistory
     */
    GrowthChangeHistory findById(Long id);
}
