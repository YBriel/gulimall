package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ISkuFullReductionService;
import com.muchi.gulimallcoupon.coupon.entity.SkuFullReduction;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品满减信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"商品满减信息"})
@RestController
@RequestMapping("/sku-full-reduction")
public class SkuFullReductionController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISkuFullReductionService skuFullReductionService;


    @ApiOperation(value = "新增商品满减信息")
    @PostMapping()
    public int add(@RequestBody SkuFullReduction skuFullReduction){
        return skuFullReductionService.add(skuFullReduction);
    }

    @ApiOperation(value = "删除商品满减信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return skuFullReductionService.delete(id);
    }

    @ApiOperation(value = "更新商品满减信息")
    @PutMapping()
    public int update(@RequestBody SkuFullReduction skuFullReduction){
        return skuFullReductionService.updateData(skuFullReduction);
    }

    @ApiOperation(value = "查询商品满减信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SkuFullReduction> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return skuFullReductionService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品满减信息")
    @GetMapping("{id}")
    public SkuFullReduction findById(@PathVariable Long id){
        return skuFullReductionService.findById(id);
    }

}
