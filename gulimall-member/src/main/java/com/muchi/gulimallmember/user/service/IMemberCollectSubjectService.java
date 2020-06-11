package com.muchi.gulimallmember.user.service;

import com.muchi.gulimallmember.user.entity.MemberCollectSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 会员收藏的专题活动 服务类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
public interface IMemberCollectSubjectService extends IService<MemberCollectSubject> {

    /**
     * 查询会员收藏的专题活动分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<MemberCollectSubject>
     */
    IPage<MemberCollectSubject> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加会员收藏的专题活动
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return int
     */
    int add(MemberCollectSubject memberCollectSubject);

    /**
     * 删除会员收藏的专题活动
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改会员收藏的专题活动
     *
     * @param memberCollectSubject 会员收藏的专题活动
     * @return int
     */
    int updateData(MemberCollectSubject memberCollectSubject);

    /**
     * id查询数据
     *
     * @param id id
     * @return MemberCollectSubject
     */
    MemberCollectSubject findById(Long id);
}
