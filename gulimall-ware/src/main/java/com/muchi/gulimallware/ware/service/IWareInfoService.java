package com.muchi.gulimallware.ware.service;

import com.muchi.gulimallware.ware.entity.WareInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 仓库信息 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IWareInfoService extends IService<WareInfo> {

    /**
     * 查询仓库信息分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<WareInfo>
     */
    IPage<WareInfo> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加仓库信息
     *
     * @param wareInfo 仓库信息
     * @return int
     */
    int add(WareInfo wareInfo);

    /**
     * 删除仓库信息
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改仓库信息
     *
     * @param wareInfo 仓库信息
     * @return int
     */
    int updateData(WareInfo wareInfo);

    /**
     * id查询数据
     *
     * @param id id
     * @return WareInfo
     */
    WareInfo findById(Long id);
}
