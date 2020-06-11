package com.muchi.gulimallorder.order.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallorder.order.service.IRefundInfoService;
import com.muchi.gulimallorder.order.entity.RefundInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 退款信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"退款信息"})
@RestController
@RequestMapping("/refund-info")
public class RefundInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IRefundInfoService refundInfoService;


    @ApiOperation(value = "新增退款信息")
    @PostMapping()
    public int add(@RequestBody RefundInfo refundInfo){
        return refundInfoService.add(refundInfo);
    }

    @ApiOperation(value = "删除退款信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return refundInfoService.delete(id);
    }

    @ApiOperation(value = "更新退款信息")
    @PutMapping()
    public int update(@RequestBody RefundInfo refundInfo){
        return refundInfoService.updateData(refundInfo);
    }

    @ApiOperation(value = "查询退款信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<RefundInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return refundInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询退款信息")
    @GetMapping("{id}")
    public RefundInfo findById(@PathVariable Long id){
        return refundInfoService.findById(id);
    }

}
