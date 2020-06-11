package com.muchi.gulimallware.ware.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallware.ware.service.IWareInfoService;
import com.muchi.gulimallware.ware.entity.WareInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 仓库信息 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"仓库信息"})
@RestController
@RequestMapping("/ware-info")
public class WareInfoController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWareInfoService wareInfoService;


    @ApiOperation(value = "新增仓库信息")
    @PostMapping()
    public int add(@RequestBody WareInfo wareInfo){
        return wareInfoService.add(wareInfo);
    }

    @ApiOperation(value = "删除仓库信息")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return wareInfoService.delete(id);
    }

    @ApiOperation(value = "更新仓库信息")
    @PutMapping()
    public int update(@RequestBody WareInfo wareInfo){
        return wareInfoService.updateData(wareInfo);
    }

    @ApiOperation(value = "查询仓库信息分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<WareInfo> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return wareInfoService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询仓库信息")
    @GetMapping("{id}")
    public WareInfo findById(@PathVariable Long id){
        return wareInfoService.findById(id);
    }

}
