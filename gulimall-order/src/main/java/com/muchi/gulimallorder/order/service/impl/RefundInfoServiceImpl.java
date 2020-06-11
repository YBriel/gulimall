package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.RefundInfo;
import com.muchi.gulimallorder.order.dao.RefundInfoMapper;
import com.muchi.gulimallorder.order.service.IRefundInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 退款信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements IRefundInfoService {

    @Override
    public  IPage<RefundInfo> findListByPage(Integer page, Integer pageCount){
        IPage<RefundInfo> wherePage = new Page<>(page, pageCount);
        RefundInfo where = new RefundInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(RefundInfo refundInfo){
        return baseMapper.insert(refundInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(RefundInfo refundInfo){
        return baseMapper.updateById(refundInfo);
    }

    @Override
    public RefundInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
