package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ISpuInfoService;
import com.muchi.gulimallproduct.product.entity.SpuInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * spu信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"spu信息"})
@RestController
@RequestMapping("/spu-info")
public class SpuInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISpuInfoService spuInfoService;


    @ApiOperation(value = "新增spu信息")
    @PostMapping()
    public int add(@RequestBody SpuInfo spuInfo){
        return spuInfoService.add(spuInfo);
    }

    @ApiOperation(value = "删除spu信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return spuInfoService.delete(id);
    }

    @ApiOperation(value = "更新spu信息")
    @PutMapping()
    public int update(@RequestBody SpuInfo spuInfo){
        return spuInfoService.updateData(spuInfo);
    }

    @ApiOperation(value = "查询spu信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SpuInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return spuInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询spu信息")
    @GetMapping("{id}")
    public SpuInfo findById(@PathVariable Long id){
        return spuInfoService.findById(id);
    }

}
