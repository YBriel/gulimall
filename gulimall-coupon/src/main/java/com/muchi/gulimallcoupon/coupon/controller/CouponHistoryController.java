package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ICouponHistoryService;
import com.muchi.gulimallcoupon.coupon.entity.CouponHistory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券领取历史记录 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"优惠券领取历史记录"})
@RestController
@RequestMapping("/coupon-history")
public class CouponHistoryController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ICouponHistoryService couponHistoryService;


    @ApiOperation(value = "新增优惠券领取历史记录")
    @PostMapping()
    public int add(@RequestBody CouponHistory couponHistory){
        return couponHistoryService.add(couponHistory);
    }

    @ApiOperation(value = "删除优惠券领取历史记录")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return couponHistoryService.delete(id);
    }

    @ApiOperation(value = "更新优惠券领取历史记录")
    @PutMapping()
    public int update(@RequestBody CouponHistory couponHistory){
        return couponHistoryService.updateData(couponHistory);
    }

    @ApiOperation(value = "查询优惠券领取历史记录分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<CouponHistory> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return couponHistoryService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询优惠券领取历史记录")
    @GetMapping("{id}")
    public CouponHistory findById(@PathVariable Long id){
        return couponHistoryService.findById(id);
    }

}
