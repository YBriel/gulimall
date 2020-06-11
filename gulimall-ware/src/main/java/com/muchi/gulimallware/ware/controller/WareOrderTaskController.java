package com.muchi.gulimallware.ware.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallware.ware.service.IWareOrderTaskService;
import com.muchi.gulimallware.ware.entity.WareOrderTask;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 库存工作单 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"库存工作单"})
@RestController
@RequestMapping("/ware-order-task")
public class WareOrderTaskController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWareOrderTaskService wareOrderTaskService;


    @ApiOperation(value = "新增库存工作单")
    @PostMapping()
    public int add(@RequestBody WareOrderTask wareOrderTask){
        return wareOrderTaskService.add(wareOrderTask);
    }

    @ApiOperation(value = "删除库存工作单")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return wareOrderTaskService.delete(id);
    }

    @ApiOperation(value = "更新库存工作单")
    @PutMapping()
    public int update(@RequestBody WareOrderTask wareOrderTask){
        return wareOrderTaskService.updateData(wareOrderTask);
    }

    @ApiOperation(value = "查询库存工作单分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<WareOrderTask> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return wareOrderTaskService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询库存工作单")
    @GetMapping("{id}")
    public WareOrderTask findById(@PathVariable Long id){
        return wareOrderTaskService.findById(id);
    }

}
