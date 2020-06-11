package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ICouponSpuCategoryRelationService;
import com.muchi.gulimallcoupon.coupon.entity.CouponSpuCategoryRelation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券分类关联 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"优惠券分类关联"})
@RestController
@RequestMapping("/coupon-spu-category-relation")
public class CouponSpuCategoryRelationController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ICouponSpuCategoryRelationService couponSpuCategoryRelationService;


    @ApiOperation(value = "新增优惠券分类关联")
    @PostMapping()
    public int add(@RequestBody CouponSpuCategoryRelation couponSpuCategoryRelation){
        return couponSpuCategoryRelationService.add(couponSpuCategoryRelation);
    }

    @ApiOperation(value = "删除优惠券分类关联")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return couponSpuCategoryRelationService.delete(id);
    }

    @ApiOperation(value = "更新优惠券分类关联")
    @PutMapping()
    public int update(@RequestBody CouponSpuCategoryRelation couponSpuCategoryRelation){
        return couponSpuCategoryRelationService.updateData(couponSpuCategoryRelation);
    }

    @ApiOperation(value = "查询优惠券分类关联分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<CouponSpuCategoryRelation> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return couponSpuCategoryRelationService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询优惠券分类关联")
    @GetMapping("{id}")
    public CouponSpuCategoryRelation findById(@PathVariable Long id){
        return couponSpuCategoryRelationService.findById(id);
    }

}
