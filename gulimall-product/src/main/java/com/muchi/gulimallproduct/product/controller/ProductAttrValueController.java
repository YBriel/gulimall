package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.IProductAttrValueService;
import com.muchi.gulimallproduct.product.entity.ProductAttrValue;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * spu属性值 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"spu属性值"})
@RestController
@RequestMapping("/product-attr-value")
public class ProductAttrValueController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IProductAttrValueService productAttrValueService;


    @ApiOperation(value = "新增spu属性值")
    @PostMapping()
    public int add(@RequestBody ProductAttrValue productAttrValue){
        return productAttrValueService.add(productAttrValue);
    }

    @ApiOperation(value = "删除spu属性值")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return productAttrValueService.delete(id);
    }

    @ApiOperation(value = "更新spu属性值")
    @PutMapping()
    public int update(@RequestBody ProductAttrValue productAttrValue){
        return productAttrValueService.updateData(productAttrValue);
    }

    @ApiOperation(value = "查询spu属性值分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<ProductAttrValue> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return productAttrValueService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询spu属性值")
    @GetMapping("{id}")
    public ProductAttrValue findById(@PathVariable Long id){
        return productAttrValueService.findById(id);
    }

}
