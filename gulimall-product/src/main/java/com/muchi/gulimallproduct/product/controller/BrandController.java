package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.IBrandService;
import com.muchi.gulimallproduct.product.entity.Brand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 品牌 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"品牌"})
@RestController
@RequestMapping("/brand")
public class BrandController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IBrandService brandService;


    @ApiOperation(value = "新增品牌")
    @PostMapping()
    public int add(@RequestBody Brand brand){
        return brandService.add(brand);
    }

    @ApiOperation(value = "删除品牌")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return brandService.delete(id);
    }

    @ApiOperation(value = "更新品牌")
    @PutMapping()
    public int update(@RequestBody Brand brand){
        return brandService.updateData(brand);
    }

    @ApiOperation(value = "查询品牌分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Brand> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return brandService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询品牌")
    @GetMapping("{id}")
    public Brand findById(@PathVariable Long id){
        return brandService.findById(id);
    }

}
