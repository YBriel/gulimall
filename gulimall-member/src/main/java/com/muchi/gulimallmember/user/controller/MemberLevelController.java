package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IMemberLevelService;
import com.muchi.gulimallmember.user.entity.MemberLevel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员等级 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"会员等级"})
@RestController
@RequestMapping("/member-level")
public class MemberLevelController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberLevelService memberLevelService;


    @ApiOperation(value = "新增会员等级")
    @PostMapping()
    public int add(@RequestBody MemberLevel memberLevel){
        return memberLevelService.add(memberLevel);
    }

    @ApiOperation(value = "删除会员等级")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberLevelService.delete(id);
    }

    @ApiOperation(value = "更新会员等级")
    @PutMapping()
    public int update(@RequestBody MemberLevel memberLevel){
        return memberLevelService.updateData(memberLevel);
    }

    @ApiOperation(value = "查询会员等级分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<MemberLevel> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberLevelService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询会员等级")
    @GetMapping("{id}")
    public MemberLevel findById(@PathVariable Long id){
        return memberLevelService.findById(id);
    }

}
