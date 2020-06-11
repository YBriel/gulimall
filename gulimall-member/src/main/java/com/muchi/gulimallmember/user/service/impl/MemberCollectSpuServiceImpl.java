package com.muchi.gulimallmember.user.service.impl;

import com.muchi.gulimallmember.user.entity.MemberCollectSpu;
import com.muchi.gulimallmember.user.dao.MemberCollectSpuMapper;
import com.muchi.gulimallmember.user.service.IMemberCollectSpuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 会员收藏的商品 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuMapper, MemberCollectSpu> implements IMemberCollectSpuService {

    @Override
    public  IPage<MemberCollectSpu> findListByPage(Integer page, Integer pageCount){
        IPage<MemberCollectSpu> wherePage = new Page<>(page, pageCount);
        MemberCollectSpu where = new MemberCollectSpu();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(MemberCollectSpu memberCollectSpu){
        return baseMapper.insert(memberCollectSpu);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(MemberCollectSpu memberCollectSpu){
        return baseMapper.updateById(memberCollectSpu);
    }

    @Override
    public MemberCollectSpu findById(Long id){
        return  baseMapper.selectById(id);
    }
}
