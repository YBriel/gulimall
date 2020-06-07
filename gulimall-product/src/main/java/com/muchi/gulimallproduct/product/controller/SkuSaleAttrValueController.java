package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ISkuSaleAttrValueService;
import com.muchi.gulimallproduct.product.entity.SkuSaleAttrValue;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * sku销售属性&值 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"sku销售属性&值"})
@RestController
@RequestMapping("/sku-sale-attr-value")
public class SkuSaleAttrValueController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISkuSaleAttrValueService skuSaleAttrValueService;


    @ApiOperation(value = "新增sku销售属性&值")
    @PostMapping()
    public int add(@RequestBody SkuSaleAttrValue skuSaleAttrValue){
        return skuSaleAttrValueService.add(skuSaleAttrValue);
    }

    @ApiOperation(value = "删除sku销售属性&值")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return skuSaleAttrValueService.delete(id);
    }

    @ApiOperation(value = "更新sku销售属性&值")
    @PutMapping()
    public int update(@RequestBody SkuSaleAttrValue skuSaleAttrValue){
        return skuSaleAttrValueService.updateData(skuSaleAttrValue);
    }

    @ApiOperation(value = "查询sku销售属性&值分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SkuSaleAttrValue> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return skuSaleAttrValueService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询sku销售属性&值")
    @GetMapping("{id}")
    public SkuSaleAttrValue findById(@PathVariable Long id){
        return skuSaleAttrValueService.findById(id);
    }

}
