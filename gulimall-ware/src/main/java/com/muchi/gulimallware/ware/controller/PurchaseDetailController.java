package com.muchi.gulimallware.ware.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallware.ware.service.IPurchaseDetailService;
import com.muchi.gulimallware.ware.entity.PurchaseDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {""})
@RestController
@RequestMapping("/purchase-detail")
public class PurchaseDetailController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IPurchaseDetailService purchaseDetailService;


    @ApiOperation(value = "新增")
    @PostMapping()
    public int add(@RequestBody PurchaseDetail purchaseDetail){
        return purchaseDetailService.add(purchaseDetail);
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return purchaseDetailService.delete(id);
    }

    @ApiOperation(value = "更新")
    @PutMapping()
    public int update(@RequestBody PurchaseDetail purchaseDetail){
        return purchaseDetailService.updateData(purchaseDetail);
    }

    @ApiOperation(value = "查询分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<PurchaseDetail> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return purchaseDetailService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询")
    @GetMapping("{id}")
    public PurchaseDetail findById(@PathVariable Long id){
        return purchaseDetailService.findById(id);
    }

}
