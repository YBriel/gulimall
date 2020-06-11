package com.muchi.gulimallware.ware.service;

import com.muchi.gulimallware.ware.entity.WareOrderTask;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 库存工作单 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IWareOrderTaskService extends IService<WareOrderTask> {

    /**
     * 查询库存工作单分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<WareOrderTask>
     */
    IPage<WareOrderTask> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加库存工作单
     *
     * @param wareOrderTask 库存工作单
     * @return int
     */
    int add(WareOrderTask wareOrderTask);

    /**
     * 删除库存工作单
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改库存工作单
     *
     * @param wareOrderTask 库存工作单
     * @return int
     */
    int updateData(WareOrderTask wareOrderTask);

    /**
     * id查询数据
     *
     * @param id id
     * @return WareOrderTask
     */
    WareOrderTask findById(Long id);
}
