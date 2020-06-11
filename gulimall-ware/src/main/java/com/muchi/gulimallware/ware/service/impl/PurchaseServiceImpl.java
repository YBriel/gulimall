package com.muchi.gulimallware.ware.service.impl;

import com.muchi.gulimallware.ware.entity.Purchase;
import com.muchi.gulimallware.ware.dao.PurchaseMapper;
import com.muchi.gulimallware.ware.service.IPurchaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 采购信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase> implements IPurchaseService {

    @Override
    public  IPage<Purchase> findListByPage(Integer page, Integer pageCount){
        IPage<Purchase> wherePage = new Page<>(page, pageCount);
        Purchase where = new Purchase();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(Purchase purchase){
        return baseMapper.insert(purchase);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(Purchase purchase){
        return baseMapper.updateById(purchase);
    }

    @Override
    public Purchase findById(Long id){
        return  baseMapper.selectById(id);
    }
}
