package com.muchi.gulimallware.ware.service.impl;

import com.muchi.gulimallware.ware.entity.WareInfo;
import com.muchi.gulimallware.ware.dao.WareInfoMapper;
import com.muchi.gulimallware.ware.service.IWareInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 仓库信息 服务实现类
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Service
public class WareInfoServiceImpl extends ServiceImpl<WareInfoMapper, WareInfo> implements IWareInfoService {

    @Override
    public  IPage<WareInfo> findListByPage(Integer page, Integer pageCount){
        IPage<WareInfo> wherePage = new Page<>(page, pageCount);
        WareInfo where = new WareInfo();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(WareInfo wareInfo){
        return baseMapper.insert(wareInfo);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(WareInfo wareInfo){
        return baseMapper.updateById(wareInfo);
    }

    @Override
    public WareInfo findById(Long id){
        return  baseMapper.selectById(id);
    }
}
