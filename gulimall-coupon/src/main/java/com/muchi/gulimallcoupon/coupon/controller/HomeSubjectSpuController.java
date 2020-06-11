package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.IHomeSubjectSpuService;
import com.muchi.gulimallcoupon.coupon.entity.HomeSubjectSpu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 专题商品 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"专题商品"})
@RestController
@RequestMapping("/home-subject-spu")
public class HomeSubjectSpuController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IHomeSubjectSpuService homeSubjectSpuService;


    @ApiOperation(value = "新增专题商品")
    @PostMapping()
    public int add(@RequestBody HomeSubjectSpu homeSubjectSpu){
        return homeSubjectSpuService.add(homeSubjectSpu);
    }

    @ApiOperation(value = "删除专题商品")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return homeSubjectSpuService.delete(id);
    }

    @ApiOperation(value = "更新专题商品")
    @PutMapping()
    public int update(@RequestBody HomeSubjectSpu homeSubjectSpu){
        return homeSubjectSpuService.updateData(homeSubjectSpu);
    }

    @ApiOperation(value = "查询专题商品分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<HomeSubjectSpu> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return homeSubjectSpuService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询专题商品")
    @GetMapping("{id}")
    public HomeSubjectSpu findById(@PathVariable Long id){
        return homeSubjectSpuService.findById(id);
    }

}
