package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ICouponService;
import com.muchi.gulimallcoupon.coupon.entity.Coupon;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"优惠券信息"})
@RestController
@RequestMapping("/coupon")
public class CouponController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ICouponService couponService;


    @ApiOperation(value = "新增优惠券信息")
    @PostMapping()
    public int add(@RequestBody Coupon coupon){
        return couponService.add(coupon);
    }

    @ApiOperation(value = "删除优惠券信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return couponService.delete(id);
    }

    @ApiOperation(value = "更新优惠券信息")
    @PutMapping()
    public int update(@RequestBody Coupon coupon){
        return couponService.updateData(coupon);
    }

    @ApiOperation(value = "查询优惠券信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Coupon> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return couponService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询优惠券信息")
    @GetMapping("{id}")
    public Coupon findById(@PathVariable Long id){
        return couponService.findById(id);
    }

}
