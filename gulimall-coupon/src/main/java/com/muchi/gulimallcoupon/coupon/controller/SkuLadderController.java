package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ISkuLadderService;
import com.muchi.gulimallcoupon.coupon.entity.SkuLadder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品阶梯价格 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"商品阶梯价格"})
@RestController
@RequestMapping("/sku-ladder")
public class SkuLadderController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISkuLadderService skuLadderService;


    @ApiOperation(value = "新增商品阶梯价格")
    @PostMapping()
    public int add(@RequestBody SkuLadder skuLadder){
        return skuLadderService.add(skuLadder);
    }

    @ApiOperation(value = "删除商品阶梯价格")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return skuLadderService.delete(id);
    }

    @ApiOperation(value = "更新商品阶梯价格")
    @PutMapping()
    public int update(@RequestBody SkuLadder skuLadder){
        return skuLadderService.updateData(skuLadder);
    }

    @ApiOperation(value = "查询商品阶梯价格分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SkuLadder> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return skuLadderService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品阶梯价格")
    @GetMapping("{id}")
    public SkuLadder findById(@PathVariable Long id){
        return skuLadderService.findById(id);
    }

}
