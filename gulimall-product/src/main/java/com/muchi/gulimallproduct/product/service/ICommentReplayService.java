package com.muchi.gulimallproduct.product.service;

import com.muchi.gulimallproduct.product.entity.CommentReplay;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 商品评价回复关系 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
public interface ICommentReplayService extends IService<CommentReplay> {

    /**
     * 查询商品评价回复关系分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<CommentReplay>
     */
    IPage<CommentReplay> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加商品评价回复关系
     *
     * @param commentReplay 商品评价回复关系
     * @return int
     */
    int add(CommentReplay commentReplay);

    /**
     * 删除商品评价回复关系
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改商品评价回复关系
     *
     * @param commentReplay 商品评价回复关系
     * @return int
     */
    int updateData(CommentReplay commentReplay);

    /**
     * id查询数据
     *
     * @param id id
     * @return CommentReplay
     */
    CommentReplay findById(Long id);
}
