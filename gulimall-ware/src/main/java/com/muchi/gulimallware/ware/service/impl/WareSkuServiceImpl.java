package com.muchi.gulimallware.ware.service.impl;

import com.muchi.gulimallware.ware.entity.WareSku;
import com.muchi.gulimallware.ware.dao.WareSkuMapper;
import com.muchi.gulimallware.ware.service.IWareSkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 商品库存 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class WareSkuServiceImpl extends ServiceImpl<WareSkuMapper, WareSku> implements IWareSkuService {

    @Override
    public  IPage<WareSku> findListByPage(Integer page, Integer pageCount){
        IPage<WareSku> wherePage = new Page<>(page, pageCount);
        WareSku where = new WareSku();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(WareSku wareSku){
        return baseMapper.insert(wareSku);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(WareSku wareSku){
        return baseMapper.updateById(wareSku);
    }

    @Override
    public WareSku findById(Long id){
        return  baseMapper.selectById(id);
    }
}
