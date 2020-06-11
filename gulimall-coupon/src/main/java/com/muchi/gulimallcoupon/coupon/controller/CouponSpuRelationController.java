package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ICouponSpuRelationService;
import com.muchi.gulimallcoupon.coupon.entity.CouponSpuRelation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券与产品关联 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"优惠券与产品关联"})
@RestController
@RequestMapping("/coupon-spu-relation")
public class CouponSpuRelationController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ICouponSpuRelationService couponSpuRelationService;


    @ApiOperation(value = "新增优惠券与产品关联")
    @PostMapping()
    public int add(@RequestBody CouponSpuRelation couponSpuRelation){
        return couponSpuRelationService.add(couponSpuRelation);
    }

    @ApiOperation(value = "删除优惠券与产品关联")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return couponSpuRelationService.delete(id);
    }

    @ApiOperation(value = "更新优惠券与产品关联")
    @PutMapping()
    public int update(@RequestBody CouponSpuRelation couponSpuRelation){
        return couponSpuRelationService.updateData(couponSpuRelation);
    }

    @ApiOperation(value = "查询优惠券与产品关联分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<CouponSpuRelation> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return couponSpuRelationService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询优惠券与产品关联")
    @GetMapping("{id}")
    public CouponSpuRelation findById(@PathVariable Long id){
        return couponSpuRelationService.findById(id);
    }

}
