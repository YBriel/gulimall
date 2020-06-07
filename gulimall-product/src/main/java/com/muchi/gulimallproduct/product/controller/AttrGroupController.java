package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.IAttrGroupService;
import com.muchi.gulimallproduct.product.entity.AttrGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 属性分组 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"属性分组"})
@RestController
@RequestMapping("/attr-group")
public class AttrGroupController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IAttrGroupService attrGroupService;


    @ApiOperation(value = "新增属性分组")
    @PostMapping()
    public int add(@RequestBody AttrGroup attrGroup){
        return attrGroupService.add(attrGroup);
    }

    @ApiOperation(value = "删除属性分组")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return attrGroupService.delete(id);
    }

    @ApiOperation(value = "更新属性分组")
    @PutMapping()
    public int update(@RequestBody AttrGroup attrGroup){
        return attrGroupService.updateData(attrGroup);
    }

    @ApiOperation(value = "查询属性分组分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<AttrGroup> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return attrGroupService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询属性分组")
    @GetMapping("{id}")
    public AttrGroup findById(@PathVariable Long id){
        return attrGroupService.findById(id);
    }

}
