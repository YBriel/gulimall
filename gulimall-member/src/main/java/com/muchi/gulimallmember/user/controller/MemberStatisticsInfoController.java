package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IMemberStatisticsInfoService;
import com.muchi.gulimallmember.user.entity.MemberStatisticsInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员统计信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"会员统计信息"})
@RestController
@RequestMapping("/member-statistics-info")
public class MemberStatisticsInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberStatisticsInfoService memberStatisticsInfoService;


    @ApiOperation(value = "新增会员统计信息")
    @PostMapping()
    public int add(@RequestBody MemberStatisticsInfo memberStatisticsInfo){
        return memberStatisticsInfoService.add(memberStatisticsInfo);
    }

    @ApiOperation(value = "删除会员统计信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberStatisticsInfoService.delete(id);
    }

    @ApiOperation(value = "更新会员统计信息")
    @PutMapping()
    public int update(@RequestBody MemberStatisticsInfo memberStatisticsInfo){
        return memberStatisticsInfoService.updateData(memberStatisticsInfo);
    }

    @ApiOperation(value = "查询会员统计信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<MemberStatisticsInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberStatisticsInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询会员统计信息")
    @GetMapping("{id}")
    public MemberStatisticsInfo findById(@PathVariable Long id){
        return memberStatisticsInfoService.findById(id);
    }

}
