package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ISpuCommentService;
import com.muchi.gulimallproduct.product.entity.SpuComment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品评价 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"商品评价"})
@RestController
@RequestMapping("/spu-comment")
public class SpuCommentController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISpuCommentService spuCommentService;


    @ApiOperation(value = "新增商品评价")
    @PostMapping()
    public int add(@RequestBody SpuComment spuComment){
        return spuCommentService.add(spuComment);
    }

    @ApiOperation(value = "删除商品评价")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return spuCommentService.delete(id);
    }

    @ApiOperation(value = "更新商品评价")
    @PutMapping()
    public int update(@RequestBody SpuComment spuComment){
        return spuCommentService.updateData(spuComment);
    }

    @ApiOperation(value = "查询商品评价分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SpuComment> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return spuCommentService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品评价")
    @GetMapping("{id}")
    public SpuComment findById(@PathVariable Long id){
        return spuCommentService.findById(id);
    }

}
