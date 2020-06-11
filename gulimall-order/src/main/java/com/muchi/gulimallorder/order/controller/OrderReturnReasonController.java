package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IOrderReturnReasonService;
import com.muchi.gulimallorder.order.entity.OrderReturnReason;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 退货原因 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"退货原因"})
@RestController
@RequestMapping("/order-return-reason")
public class OrderReturnReasonController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IOrderReturnReasonService orderReturnReasonService;


    @ApiOperation(value = "新增退货原因")
    @PostMapping()
    public int add(@RequestBody OrderReturnReason orderReturnReason){
        return orderReturnReasonService.add(orderReturnReason);
    }

    @ApiOperation(value = "删除退货原因")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return orderReturnReasonService.delete(id);
    }

    @ApiOperation(value = "更新退货原因")
    @PutMapping()
    public int update(@RequestBody OrderReturnReason orderReturnReason){
        return orderReturnReasonService.updateData(orderReturnReason);
    }

    @ApiOperation(value = "查询退货原因分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<OrderReturnReason> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return orderReturnReasonService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询退货原因")
    @GetMapping("{id}")
    public OrderReturnReason findById(@PathVariable Long id){
        return orderReturnReasonService.findById(id);
    }

}
