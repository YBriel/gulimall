package com.muchi.gulimallware.ware.service.impl;

import com.muchi.gulimallware.ware.entity.PurchaseDetail;
import com.muchi.gulimallware.ware.dao.PurchaseDetailMapper;
import com.muchi.gulimallware.ware.service.IPurchaseDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailMapper, PurchaseDetail> implements IPurchaseDetailService {

    @Override
    public  IPage<PurchaseDetail> findListByPage(Integer page, Integer pageCount){
        IPage<PurchaseDetail> wherePage = new Page<>(page, pageCount);
        PurchaseDetail where = new PurchaseDetail();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(PurchaseDetail purchaseDetail){
        return baseMapper.insert(purchaseDetail);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(PurchaseDetail purchaseDetail){
        return baseMapper.updateById(purchaseDetail);
    }

    @Override
    public PurchaseDetail findById(Long id){
        return  baseMapper.selectById(id);
    }
}
