package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ISkuImagesService;
import com.muchi.gulimallproduct.product.entity.SkuImages;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * sku图片 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"sku图片"})
@RestController
@RequestMapping("/sku-images")
public class SkuImagesController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISkuImagesService skuImagesService;


    @ApiOperation(value = "新增sku图片")
    @PostMapping()
    public int add(@RequestBody SkuImages skuImages){
        return skuImagesService.add(skuImages);
    }

    @ApiOperation(value = "删除sku图片")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return skuImagesService.delete(id);
    }

    @ApiOperation(value = "更新sku图片")
    @PutMapping()
    public int update(@RequestBody SkuImages skuImages){
        return skuImagesService.updateData(skuImages);
    }

    @ApiOperation(value = "查询sku图片分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SkuImages> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return skuImagesService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询sku图片")
    @GetMapping("{id}")
    public SkuImages findById(@PathVariable Long id){
        return skuImagesService.findById(id);
    }

}
