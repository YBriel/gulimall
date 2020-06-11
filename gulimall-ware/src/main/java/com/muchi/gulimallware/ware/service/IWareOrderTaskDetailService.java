package com.muchi.gulimallware.ware.service;

import com.muchi.gulimallware.ware.entity.WareOrderTaskDetail;
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
public interface IWareOrderTaskDetailService extends IService<WareOrderTaskDetail> {

    /**
     * 查询库存工作单分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<WareOrderTaskDetail>
     */
    IPage<WareOrderTaskDetail> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加库存工作单
     *
     * @param wareOrderTaskDetail 库存工作单
     * @return int
     */
    int add(WareOrderTaskDetail wareOrderTaskDetail);

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
     * @param wareOrderTaskDetail 库存工作单
     * @return int
     */
    int updateData(WareOrderTaskDetail wareOrderTaskDetail);

    /**
     * id查询数据
     *
     * @param id id
     * @return WareOrderTaskDetail
     */
    WareOrderTaskDetail findById(Long id);
}
