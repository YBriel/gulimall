package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.IHomeAdvService;
import com.muchi.gulimallcoupon.coupon.entity.HomeAdv;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 首页轮播广告 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"首页轮播广告"})
@RestController
@RequestMapping("/home-adv")
public class HomeAdvController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IHomeAdvService homeAdvService;


    @ApiOperation(value = "新增首页轮播广告")
    @PostMapping()
    public int add(@RequestBody HomeAdv homeAdv){
        return homeAdvService.add(homeAdv);
    }

    @ApiOperation(value = "删除首页轮播广告")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return homeAdvService.delete(id);
    }

    @ApiOperation(value = "更新首页轮播广告")
    @PutMapping()
    public int update(@RequestBody HomeAdv homeAdv){
        return homeAdvService.updateData(homeAdv);
    }

    @ApiOperation(value = "查询首页轮播广告分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<HomeAdv> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return homeAdvService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询首页轮播广告")
    @GetMapping("{id}")
    public HomeAdv findById(@PathVariable Long id){
        return homeAdvService.findById(id);
    }

}
