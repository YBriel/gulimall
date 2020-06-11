package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IMemberCollectSubjectService;
import com.muchi.gulimallmember.user.entity.MemberCollectSubject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员收藏的专题活动 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"会员收藏的专题活动"})
@RestController
@RequestMapping("/member-collect-subject")
public class MemberCollectSubjectController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberCollectSubjectService memberCollectSubjectService;


    @ApiOperation(value = "新增会员收藏的专题活动")
    @PostMapping()
    public int add(@RequestBody MemberCollectSubject memberCollectSubject){
        return memberCollectSubjectService.add(memberCollectSubject);
    }

    @ApiOperation(value = "删除会员收藏的专题活动")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberCollectSubjectService.delete(id);
    }

    @ApiOperation(value = "更新会员收藏的专题活动")
    @PutMapping()
    public int update(@RequestBody MemberCollectSubject memberCollectSubject){
        return memberCollectSubjectService.updateData(memberCollectSubject);
    }

    @ApiOperation(value = "查询会员收藏的专题活动分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<MemberCollectSubject> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberCollectSubjectService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询会员收藏的专题活动")
    @GetMapping("{id}")
    public MemberCollectSubject findById(@PathVariable Long id){
        return memberCollectSubjectService.findById(id);
    }

}
