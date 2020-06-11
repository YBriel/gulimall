package com.muchi.gulimallorder.order.service.impl;

import com.muchi.gulimallorder.order.entity.PaymentInfo;
import com.muchi.gulimallorder.order.dao.PaymentInfoMapper;
import com.muchi.gulimallorder.order.service.IPaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 支付信息表 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements IPaymentInfoService {

    @Override
    public  IPage<PaymentInfo> findListByPage(Integer page, Integer pageCount){
        IPage<PaymentInfo> wherePage = new Page<>(page, pageCount);
        PaymentInfo where = new PaymentInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(PaymentInfo paymentInfo){
        return baseMapper.insert(paymentInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(PaymentInfo paymentInfo){
        return baseMapper.updateById(paymentInfo);
    }

    @Override
    public PaymentInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
