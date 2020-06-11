package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IMemberLoginLogService;
import com.muchi.gulimallmember.user.entity.MemberLoginLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员登录记录 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"会员登录记录"})
@RestController
@RequestMapping("/member-login-log")
public class MemberLoginLogController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberLoginLogService memberLoginLogService;


    @ApiOperation(value = "新增会员登录记录")
    @PostMapping()
    public int add(@RequestBody MemberLoginLog memberLoginLog){
        return memberLoginLogService.add(memberLoginLog);
    }

    @ApiOperation(value = "删除会员登录记录")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberLoginLogService.delete(id);
    }

    @ApiOperation(value = "更新会员登录记录")
    @PutMapping()
    public int update(@RequestBody MemberLoginLog memberLoginLog){
        return memberLoginLogService.updateData(memberLoginLog);
    }

    @ApiOperation(value = "查询会员登录记录分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<MemberLoginLog> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberLoginLogService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询会员登录记录")
    @GetMapping("{id}")
    public MemberLoginLog findById(@PathVariable Long id){
        return memberLoginLogService.findById(id);
    }

}
