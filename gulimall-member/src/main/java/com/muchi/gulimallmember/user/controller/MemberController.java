package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IMemberService;
import com.muchi.gulimallmember.user.entity.Member;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"会员"})
@RestController
@RequestMapping("/member")
public class MemberController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberService memberService;


    @ApiOperation(value = "新增会员")
    @PostMapping()
    public int add(@RequestBody Member member){
        return memberService.add(member);
    }

    @ApiOperation(value = "删除会员")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberService.delete(id);
    }

    @ApiOperation(value = "更新会员")
    @PutMapping()
    public int update(@RequestBody Member member){
        return memberService.updateData(member);
    }

    @ApiOperation(value = "查询会员分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<Member> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询会员")
    @GetMapping("{id}")
    public Member findById(@PathVariable Long id){
        return memberService.findById(id);
    }

}
