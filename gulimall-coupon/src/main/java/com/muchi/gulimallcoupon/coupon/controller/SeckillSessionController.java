package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ISeckillSessionService;
import com.muchi.gulimallcoupon.coupon.entity.SeckillSession;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 秒杀活动场次 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"秒杀活动场次"})
@RestController
@RequestMapping("/seckill-session")
public class SeckillSessionController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISeckillSessionService seckillSessionService;


    @ApiOperation(value = "新增秒杀活动场次")
    @PostMapping()
    public int add(@RequestBody SeckillSession seckillSession){
        return seckillSessionService.add(seckillSession);
    }

    @ApiOperation(value = "删除秒杀活动场次")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return seckillSessionService.delete(id);
    }

    @ApiOperation(value = "更新秒杀活动场次")
    @PutMapping()
    public int update(@RequestBody SeckillSession seckillSession){
        return seckillSessionService.updateData(seckillSession);
    }

    @ApiOperation(value = "查询秒杀活动场次分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SeckillSession> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return seckillSessionService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询秒杀活动场次")
    @GetMapping("{id}")
    public SeckillSession findById(@PathVariable Long id){
        return seckillSessionService.findById(id);
    }

}
