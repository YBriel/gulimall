package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ISkuInfoService;
import com.muchi.gulimallproduct.product.entity.SkuInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * sku信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"sku信息"})
@RestController
@RequestMapping("/sku-info")
public class SkuInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISkuInfoService skuInfoService;


    @ApiOperation(value = "新增sku信息")
    @PostMapping()
    public int add(@RequestBody SkuInfo skuInfo){
        return skuInfoService.add(skuInfo);
    }

    @ApiOperation(value = "删除sku信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return skuInfoService.delete(id);
    }

    @ApiOperation(value = "更新sku信息")
    @PutMapping()
    public int update(@RequestBody SkuInfo skuInfo){
        return skuInfoService.updateData(skuInfo);
    }

    @ApiOperation(value = "查询sku信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SkuInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return skuInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询sku信息")
    @GetMapping("{id}")
    public SkuInfo findById(@PathVariable Long id){
        return skuInfoService.findById(id);
    }

}
