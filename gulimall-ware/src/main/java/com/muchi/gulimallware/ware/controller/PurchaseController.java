package com.muchi.gulimallware.ware.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallware.ware.service.IPurchaseService;
import com.muchi.gulimallware.ware.entity.Purchase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 采购信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"采购信息"})
@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IPurchaseService purchaseService;


    @ApiOperation(value = "新增采购信息")
    @PostMapping()
    public int add(@RequestBody Purchase purchase){
        return purchaseService.add(purchase);
    }

    @ApiOperation(value = "删除采购信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return purchaseService.delete(id);
    }

    @ApiOperation(value = "更新采购信息")
    @PutMapping()
    public int update(@RequestBody Purchase purchase){
        return purchaseService.updateData(purchase);
    }

    @ApiOperation(value = "查询采购信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Purchase> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return purchaseService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询采购信息")
    @GetMapping("{id}")
    public Purchase findById(@PathVariable Long id){
        return purchaseService.findById(id);
    }

}
