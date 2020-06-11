package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IOrderService;
import com.muchi.gulimallorder.order.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"订单"})
@RestController
@RequestMapping("/order")
public class OrderController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IOrderService orderService;


    @ApiOperation(value = "新增订单")
    @PostMapping()
    public int add(@RequestBody Order order){
        return orderService.add(order);
    }

    @ApiOperation(value = "删除订单")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return orderService.delete(id);
    }

    @ApiOperation(value = "更新订单")
    @PutMapping()
    public int update(@RequestBody Order order){
        return orderService.updateData(order);
    }

    @ApiOperation(value = "查询订单分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Order> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return orderService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询订单")
    @GetMapping("{id}")
    public Order findById(@PathVariable Long id){
        return orderService.findById(id);
    }

}
