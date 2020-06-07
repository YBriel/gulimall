package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.IAttrService;
import com.muchi.gulimallproduct.product.entity.Attr;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品属性 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"商品属性"})
@RestController
@RequestMapping("/attr")
public class AttrController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IAttrService attrService;


    @ApiOperation(value = "新增商品属性")
    @PostMapping()
    public int add(@RequestBody Attr attr){
        return attrService.add(attr);
    }

    @ApiOperation(value = "删除商品属性")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return attrService.delete(id);
    }

    @ApiOperation(value = "更新商品属性")
    @PutMapping()
    public int update(@RequestBody Attr attr){
        return attrService.updateData(attr);
    }

    @ApiOperation(value = "查询商品属性分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Attr> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return attrService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品属性")
    @GetMapping("{id}")
    public Attr findById(@PathVariable Long id){
        return attrService.findById(id);
    }

}
