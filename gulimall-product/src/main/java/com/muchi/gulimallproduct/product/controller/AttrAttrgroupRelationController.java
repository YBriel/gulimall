package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.IAttrAttrgroupRelationService;
import com.muchi.gulimallproduct.product.entity.AttrAttrgroupRelation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 属性&属性分组关联 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"属性&属性分组关联"})
@RestController
@RequestMapping("/attr-attrgroup-relation")
public class AttrAttrgroupRelationController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IAttrAttrgroupRelationService attrAttrgroupRelationService;


    @ApiOperation(value = "新增属性&属性分组关联")
    @PostMapping()
    public int add(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
        return attrAttrgroupRelationService.add(attrAttrgroupRelation);
    }

    @ApiOperation(value = "删除属性&属性分组关联")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return attrAttrgroupRelationService.delete(id);
    }

    @ApiOperation(value = "更新属性&属性分组关联")
    @PutMapping()
    public int update(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
        return attrAttrgroupRelationService.updateData(attrAttrgroupRelation);
    }

    @ApiOperation(value = "查询属性&属性分组关联分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<AttrAttrgroupRelation> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return attrAttrgroupRelationService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询属性&属性分组关联")
    @GetMapping("{id}")
    public AttrAttrgroupRelation findById(@PathVariable Long id){
        return attrAttrgroupRelationService.findById(id);
    }

}
