package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ICategoryBrandRelationService;
import com.muchi.gulimallproduct.product.entity.CategoryBrandRelation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 品牌分类关联 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"品牌分类关联"})
@RestController
@RequestMapping("/category-brand-relation")
public class CategoryBrandRelationController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ICategoryBrandRelationService categoryBrandRelationService;


    @ApiOperation(value = "新增品牌分类关联")
    @PostMapping()
    public int add(@RequestBody CategoryBrandRelation categoryBrandRelation){
        return categoryBrandRelationService.add(categoryBrandRelation);
    }

    @ApiOperation(value = "删除品牌分类关联")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return categoryBrandRelationService.delete(id);
    }

    @ApiOperation(value = "更新品牌分类关联")
    @PutMapping()
    public int update(@RequestBody CategoryBrandRelation categoryBrandRelation){
        return categoryBrandRelationService.updateData(categoryBrandRelation);
    }

    @ApiOperation(value = "查询品牌分类关联分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<CategoryBrandRelation> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return categoryBrandRelationService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询品牌分类关联")
    @GetMapping("{id}")
    public CategoryBrandRelation findById(@PathVariable Long id){
        return categoryBrandRelationService.findById(id);
    }

}
