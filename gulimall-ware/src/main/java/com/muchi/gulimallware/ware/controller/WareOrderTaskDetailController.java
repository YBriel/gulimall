package com.muchi.gulimallware.ware.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallware.ware.service.IWareOrderTaskDetailService;
import com.muchi.gulimallware.ware.entity.WareOrderTaskDetail;
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
@RequestMapping("/ware-order-task-detail")
public class WareOrderTaskDetailController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWareOrderTaskDetailService wareOrderTaskDetailService;


    @ApiOperation(value = "新增库存工作单")
    @PostMapping()
    public int add(@RequestBody WareOrderTaskDetail wareOrderTaskDetail){
        return wareOrderTaskDetailService.add(wareOrderTaskDetail);
    }

    @ApiOperation(value = "删除库存工作单")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return wareOrderTaskDetailService.delete(id);
    }

    @ApiOperation(value = "更新库存工作单")
    @PutMapping()
    public int update(@RequestBody WareOrderTaskDetail wareOrderTaskDetail){
        return wareOrderTaskDetailService.updateData(wareOrderTaskDetail);
    }

    @ApiOperation(value = "查询库存工作单分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<WareOrderTaskDetail> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return wareOrderTaskDetailService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询库存工作单")
    @GetMapping("{id}")
    public WareOrderTaskDetail findById(@PathVariable Long id){
        return wareOrderTaskDetailService.findById(id);
    }

}
