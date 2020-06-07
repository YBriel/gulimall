package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.SpuComment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品评价 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ISpuCommentService extends IService<SpuComment> {

    /**
     * 查询商品评价分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<SpuComment>
     */
    IPage<SpuComment> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品评价
     *
     * @param spuComment 商品评价
     * @return int
     */
    int add(SpuComment spuComment);

    /**
     * 删除商品评价
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品评价
     *
     * @param spuComment 商品评价
     * @return int
     */
    int updateData(SpuComment spuComment);

    /**
     * id查询数据
     *
     * @param id id
     * @return SpuComment
     */
    SpuComment findById(Long id);
}
