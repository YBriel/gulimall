package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IOrderSettingService;
import com.muchi.gulimallorder.order.entity.OrderSetting;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单配置信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"订单配置信息"})
@RestController
@RequestMapping("/order-setting")
public class OrderSettingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IOrderSettingService orderSettingService;


    @ApiOperation(value = "新增订单配置信息")
    @PostMapping()
    public int add(@RequestBody OrderSetting orderSetting){
        return orderSettingService.add(orderSetting);
    }

    @ApiOperation(value = "删除订单配置信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return orderSettingService.delete(id);
    }

    @ApiOperation(value = "更新订单配置信息")
    @PutMapping()
    public int update(@RequestBody OrderSetting orderSetting){
        return orderSettingService.updateData(orderSetting);
    }

    @ApiOperation(value = "查询订单配置信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<OrderSetting> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return orderSettingService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询订单配置信息")
    @GetMapping("{id}")
    public OrderSetting findById(@PathVariable Long id){
        return orderSettingService.findById(id);
    }

}
