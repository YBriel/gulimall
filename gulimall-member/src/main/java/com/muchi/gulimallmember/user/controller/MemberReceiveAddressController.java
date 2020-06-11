package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IMemberReceiveAddressService;
import com.muchi.gulimallmember.user.entity.MemberReceiveAddress;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员收货地址 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"会员收货地址"})
@RestController
@RequestMapping("/member-receive-address")
public class MemberReceiveAddressController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberReceiveAddressService memberReceiveAddressService;


    @ApiOperation(value = "新增会员收货地址")
    @PostMapping()
    public int add(@RequestBody MemberReceiveAddress memberReceiveAddress){
        return memberReceiveAddressService.add(memberReceiveAddress);
    }

    @ApiOperation(value = "删除会员收货地址")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberReceiveAddressService.delete(id);
    }

    @ApiOperation(value = "更新会员收货地址")
    @PutMapping()
    public int update(@RequestBody MemberReceiveAddress memberReceiveAddress){
        return memberReceiveAddressService.updateData(memberReceiveAddress);
    }

    @ApiOperation(value = "查询会员收货地址分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<MemberReceiveAddress> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberReceiveAddressService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询会员收货地址")
    @GetMapping("{id}")
    public MemberReceiveAddress findById(@PathVariable Long id){
        return memberReceiveAddressService.findById(id);
    }

}
