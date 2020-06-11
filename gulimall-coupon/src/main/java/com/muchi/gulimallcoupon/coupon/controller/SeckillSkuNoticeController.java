package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ISeckillSkuNoticeService;
import com.muchi.gulimallcoupon.coupon.entity.SeckillSkuNotice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 秒杀商品通知订阅 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"秒杀商品通知订阅"})
@RestController
@RequestMapping("/seckill-sku-notice")
public class SeckillSkuNoticeController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISeckillSkuNoticeService seckillSkuNoticeService;


    @ApiOperation(value = "新增秒杀商品通知订阅")
    @PostMapping()
    public int add(@RequestBody SeckillSkuNotice seckillSkuNotice){
        return seckillSkuNoticeService.add(seckillSkuNotice);
    }

    @ApiOperation(value = "删除秒杀商品通知订阅")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return seckillSkuNoticeService.delete(id);
    }

    @ApiOperation(value = "更新秒杀商品通知订阅")
    @PutMapping()
    public int update(@RequestBody SeckillSkuNotice seckillSkuNotice){
        return seckillSkuNoticeService.updateData(seckillSkuNotice);
    }

    @ApiOperation(value = "查询秒杀商品通知订阅分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SeckillSkuNotice> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return seckillSkuNoticeService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询秒杀商品通知订阅")
    @GetMapping("{id}")
    public SeckillSkuNotice findById(@PathVariable Long id){
        return seckillSkuNoticeService.findById(id);
    }

}
