package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ICategoryService;
import com.muchi.gulimallproduct.product.entity.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"商品三级分类"})
@RestController
@RequestMapping("/category")
public class CategoryController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ICategoryService categoryService;


    @ApiOperation(value = "新增商品三级分类")
    @PostMapping()
    public int add(@RequestBody Category category){
        return categoryService.add(category);
    }

    @ApiOperation(value = "删除商品三级分类")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return categoryService.delete(id);
    }

    @ApiOperation(value = "更新商品三级分类")
    @PutMapping()
    public int update(@RequestBody Category category){
        return categoryService.updateData(category);
    }

    @ApiOperation(value = "查询商品三级分类分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Category> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return categoryService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品三级分类")
    @GetMapping("{id}")
    public Category findById(@PathVariable Long id){
        return categoryService.findById(id);
    }

}
