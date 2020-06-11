package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IOrderOperateHistoryService;
import com.muchi.gulimallorder.order.entity.OrderOperateHistory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单操作历史记录 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"订单操作历史记录"})
@RestController
@RequestMapping("/order-operate-history")
public class OrderOperateHistoryController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IOrderOperateHistoryService orderOperateHistoryService;


    @ApiOperation(value = "新增订单操作历史记录")
    @PostMapping()
    public int add(@RequestBody OrderOperateHistory orderOperateHistory){
        return orderOperateHistoryService.add(orderOperateHistory);
    }

    @ApiOperation(value = "删除订单操作历史记录")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return orderOperateHistoryService.delete(id);
    }

    @ApiOperation(value = "更新订单操作历史记录")
    @PutMapping()
    public int update(@RequestBody OrderOperateHistory orderOperateHistory){
        return orderOperateHistoryService.updateData(orderOperateHistory);
    }

    @ApiOperation(value = "查询订单操作历史记录分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<OrderOperateHistory> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return orderOperateHistoryService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询订单操作历史记录")
    @GetMapping("{id}")
    public OrderOperateHistory findById(@PathVariable Long id){
        return orderOperateHistoryService.findById(id);
    }

}
