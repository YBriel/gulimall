package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ISeckillPromotionService;
import com.muchi.gulimallcoupon.coupon.entity.SeckillPromotion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 秒杀活动 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"秒杀活动"})
@RestController
@RequestMapping("/seckill-promotion")
public class SeckillPromotionController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISeckillPromotionService seckillPromotionService;


    @ApiOperation(value = "新增秒杀活动")
    @PostMapping()
    public int add(@RequestBody SeckillPromotion seckillPromotion){
        return seckillPromotionService.add(seckillPromotion);
    }

    @ApiOperation(value = "删除秒杀活动")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return seckillPromotionService.delete(id);
    }

    @ApiOperation(value = "更新秒杀活动")
    @PutMapping()
    public int update(@RequestBody SeckillPromotion seckillPromotion){
        return seckillPromotionService.updateData(seckillPromotion);
    }

    @ApiOperation(value = "查询秒杀活动分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SeckillPromotion> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return seckillPromotionService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询秒杀活动")
    @GetMapping("{id}")
    public SeckillPromotion findById(@PathVariable Long id){
        return seckillPromotionService.findById(id);
    }

}
