package com.muchi.gulimallware.ware.service;

import com.muchi.gulimallware.ware.entity.WareSku;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品库存 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IWareSkuService extends IService<WareSku> {

    /**
     * 查询商品库存分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<WareSku>
     */
    IPage<WareSku> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品库存
     *
     * @param wareSku 商品库存
     * @return int
     */
    int add(WareSku wareSku);

    /**
     * 删除商品库存
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品库存
     *
     * @param wareSku 商品库存
     * @return int
     */
    int updateData(WareSku wareSku);

    /**
     * id查询数据
     *
     * @param id id
     * @return WareSku
     */
    WareSku findById(Long id);
}
