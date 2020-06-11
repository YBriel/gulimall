package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ISeckillSkuRelationService;
import com.muchi.gulimallcoupon.coupon.entity.SeckillSkuRelation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 秒杀活动商品关联 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"秒杀活动商品关联"})
@RestController
@RequestMapping("/seckill-sku-relation")
public class SeckillSkuRelationController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISeckillSkuRelationService seckillSkuRelationService;


    @ApiOperation(value = "新增秒杀活动商品关联")
    @PostMapping()
    public int add(@RequestBody SeckillSkuRelation seckillSkuRelation){
        return seckillSkuRelationService.add(seckillSkuRelation);
    }

    @ApiOperation(value = "删除秒杀活动商品关联")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return seckillSkuRelationService.delete(id);
    }

    @ApiOperation(value = "更新秒杀活动商品关联")
    @PutMapping()
    public int update(@RequestBody SeckillSkuRelation seckillSkuRelation){
        return seckillSkuRelationService.updateData(seckillSkuRelation);
    }

    @ApiOperation(value = "查询秒杀活动商品关联分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SeckillSkuRelation> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return seckillSkuRelationService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询秒杀活动商品关联")
    @GetMapping("{id}")
    public SeckillSkuRelation findById(@PathVariable Long id){
        return seckillSkuRelationService.findById(id);
    }

}
