package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.ISpuBoundsService;
import com.muchi.gulimallcoupon.coupon.entity.SpuBounds;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品spu积分设置 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"商品spu积分设置"})
@RestController
@RequestMapping("/spu-bounds")
public class SpuBoundsController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISpuBoundsService spuBoundsService;


    @ApiOperation(value = "新增商品spu积分设置")
    @PostMapping()
    public int add(@RequestBody SpuBounds spuBounds){
        return spuBoundsService.add(spuBounds);
    }

    @ApiOperation(value = "删除商品spu积分设置")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return spuBoundsService.delete(id);
    }

    @ApiOperation(value = "更新商品spu积分设置")
    @PutMapping()
    public int update(@RequestBody SpuBounds spuBounds){
        return spuBoundsService.updateData(spuBounds);
    }

    @ApiOperation(value = "查询商品spu积分设置分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SpuBounds> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return spuBoundsService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品spu积分设置")
    @GetMapping("{id}")
    public SpuBounds findById(@PathVariable Long id){
        return spuBoundsService.findById(id);
    }

}
