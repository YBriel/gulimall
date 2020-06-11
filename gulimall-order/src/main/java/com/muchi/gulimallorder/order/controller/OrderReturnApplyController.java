package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IOrderReturnApplyService;
import com.muchi.gulimallorder.order.entity.OrderReturnApply;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单退货申请 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"订单退货申请"})
@RestController
@RequestMapping("/order-return-apply")
public class OrderReturnApplyController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IOrderReturnApplyService orderReturnApplyService;


    @ApiOperation(value = "新增订单退货申请")
    @PostMapping()
    public int add(@RequestBody OrderReturnApply orderReturnApply){
        return orderReturnApplyService.add(orderReturnApply);
    }

    @ApiOperation(value = "删除订单退货申请")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return orderReturnApplyService.delete(id);
    }

    @ApiOperation(value = "更新订单退货申请")
    @PutMapping()
    public int update(@RequestBody OrderReturnApply orderReturnApply){
        return orderReturnApplyService.updateData(orderReturnApply);
    }

    @ApiOperation(value = "查询订单退货申请分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<OrderReturnApply> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return orderReturnApplyService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询订单退货申请")
    @GetMapping("{id}")
    public OrderReturnApply findById(@PathVariable Long id){
        return orderReturnApplyService.findById(id);
    }

}
