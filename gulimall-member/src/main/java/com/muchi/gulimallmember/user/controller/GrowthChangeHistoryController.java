package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IGrowthChangeHistoryService;
import com.muchi.gulimallmember.user.entity.GrowthChangeHistory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 成长值变化历史记录 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"成长值变化历史记录"})
@RestController
@RequestMapping("/growth-change-history")
public class GrowthChangeHistoryController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IGrowthChangeHistoryService growthChangeHistoryService;


    @ApiOperation(value = "新增成长值变化历史记录")
    @PostMapping()
    public int add(@RequestBody GrowthChangeHistory growthChangeHistory){
        return growthChangeHistoryService.add(growthChangeHistory);
    }

    @ApiOperation(value = "删除成长值变化历史记录")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return growthChangeHistoryService.delete(id);
    }

    @ApiOperation(value = "更新成长值变化历史记录")
    @PutMapping()
    public int update(@RequestBody GrowthChangeHistory growthChangeHistory){
        return growthChangeHistoryService.updateData(growthChangeHistory);
    }

    @ApiOperation(value = "查询成长值变化历史记录分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<GrowthChangeHistory> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return growthChangeHistoryService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询成长值变化历史记录")
    @GetMapping("{id}")
    public GrowthChangeHistory findById(@PathVariable Long id){
        return growthChangeHistoryService.findById(id);
    }

}
