package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ISpuInfoDescService;
import com.muchi.gulimallproduct.product.entity.SpuInfoDesc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * spu信息介绍 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"spu信息介绍"})
@RestController
@RequestMapping("/spu-info-desc")
public class SpuInfoDescController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISpuInfoDescService spuInfoDescService;


    @ApiOperation(value = "新增spu信息介绍")
    @PostMapping()
    public int add(@RequestBody SpuInfoDesc spuInfoDesc){
        return spuInfoDescService.add(spuInfoDesc);
    }

    @ApiOperation(value = "删除spu信息介绍")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return spuInfoDescService.delete(id);
    }

    @ApiOperation(value = "更新spu信息介绍")
    @PutMapping()
    public int update(@RequestBody SpuInfoDesc spuInfoDesc){
        return spuInfoDescService.updateData(spuInfoDesc);
    }

    @ApiOperation(value = "查询spu信息介绍分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SpuInfoDesc> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return spuInfoDescService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询spu信息介绍")
    @GetMapping("{id}")
    public SpuInfoDesc findById(@PathVariable Long id){
        return spuInfoDescService.findById(id);
    }

}
