package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.IMemberPriceService;
import com.muchi.gulimallcoupon.coupon.entity.MemberPrice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品会员价格 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"商品会员价格"})
@RestController
@RequestMapping("/member-price")
public class MemberPriceController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberPriceService memberPriceService;


    @ApiOperation(value = "新增商品会员价格")
    @PostMapping()
    public int add(@RequestBody MemberPrice memberPrice){
        return memberPriceService.add(memberPrice);
    }

    @ApiOperation(value = "删除商品会员价格")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberPriceService.delete(id);
    }

    @ApiOperation(value = "更新商品会员价格")
    @PutMapping()
    public int update(@RequestBody MemberPrice memberPrice){
        return memberPriceService.updateData(memberPrice);
    }

    @ApiOperation(value = "查询商品会员价格分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<MemberPrice> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberPriceService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品会员价格")
    @GetMapping("{id}")
    public MemberPrice findById(@PathVariable Long id){
        return memberPriceService.findById(id);
    }

}
