package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IIntegrationChangeHistoryService;
import com.muchi.gulimallmember.user.entity.IntegrationChangeHistory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 积分变化历史记录 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"积分变化历史记录"})
@RestController
@RequestMapping("/integration-change-history")
public class IntegrationChangeHistoryController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IIntegrationChangeHistoryService integrationChangeHistoryService;


    @ApiOperation(value = "新增积分变化历史记录")
    @PostMapping()
    public int add(@RequestBody IntegrationChangeHistory integrationChangeHistory){
        return integrationChangeHistoryService.add(integrationChangeHistory);
    }

    @ApiOperation(value = "删除积分变化历史记录")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return integrationChangeHistoryService.delete(id);
    }

    @ApiOperation(value = "更新积分变化历史记录")
    @PutMapping()
    public int update(@RequestBody IntegrationChangeHistory integrationChangeHistory){
        return integrationChangeHistoryService.updateData(integrationChangeHistory);
    }

    @ApiOperation(value = "查询积分变化历史记录分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<IntegrationChangeHistory> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return integrationChangeHistoryService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询积分变化历史记录")
    @GetMapping("{id}")
    public IntegrationChangeHistory findById(@PathVariable Long id){
        return integrationChangeHistoryService.findById(id);
    }

}
