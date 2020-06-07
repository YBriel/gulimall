package com.muchi.gulimallproduct.product.service.impl;

import com.muchi.gulimallproduct.product.entity.SpuInfo;
import com.muchi.gulimallproduct.product.dao.SpuInfoMapper;
import com.muchi.gulimallproduct.product.service.ISpuInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * spu信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Service
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoMapper, SpuInfo> implements ISpuInfoService {

    @Override
    public  IPage<SpuInfo> findListByPage(Integer page, Integer pageCount){
        IPage<SpuInfo> wherePage = new Page<>(page, pageCount);
        SpuInfo where = new SpuInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(SpuInfo spuInfo){
        return baseMapper.insert(spuInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(SpuInfo spuInfo){
        return baseMapper.updateById(spuInfo);
    }

    @Override
    public SpuInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
