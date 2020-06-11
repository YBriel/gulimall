package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IPaymentInfoService;
import com.muchi.gulimallorder.order.entity.PaymentInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 支付信息表 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"支付信息表"})
@RestController
@RequestMapping("/payment-info")
public class PaymentInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IPaymentInfoService paymentInfoService;


    @ApiOperation(value = "新增支付信息表")
    @PostMapping()
    public int add(@RequestBody PaymentInfo paymentInfo){
        return paymentInfoService.add(paymentInfo);
    }

    @ApiOperation(value = "删除支付信息表")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return paymentInfoService.delete(id);
    }

    @ApiOperation(value = "更新支付信息表")
    @PutMapping()
    public int update(@RequestBody PaymentInfo paymentInfo){
        return paymentInfoService.updateData(paymentInfo);
    }

    @ApiOperation(value = "查询支付信息表分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<PaymentInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return paymentInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询支付信息表")
    @GetMapping("{id}")
    public PaymentInfo findById(@PathVariable Long id){
        return paymentInfoService.findById(id);
    }

}
