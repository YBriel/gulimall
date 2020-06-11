package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IOrderItemService;
import com.muchi.gulimallorder.order.entity.OrderItem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单项信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"订单项信息"})
@RestController
@RequestMapping("/order-item")
public class OrderItemController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IOrderItemService orderItemService;


    @ApiOperation(value = "新增订单项信息")
    @PostMapping()
    public int add(@RequestBody OrderItem orderItem){
        return orderItemService.add(orderItem);
    }

    @ApiOperation(value = "删除订单项信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return orderItemService.delete(id);
    }

    @ApiOperation(value = "更新订单项信息")
    @PutMapping()
    public int update(@RequestBody OrderItem orderItem){
        return orderItemService.updateData(orderItem);
    }

    @ApiOperation(value = "查询订单项信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<OrderItem> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return orderItemService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询订单项信息")
    @GetMapping("{id}")
    public OrderItem findById(@PathVariable Long id){
        return orderItemService.findById(id);
    }

}
