package com.muchi.gulimallware.ware.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallware.ware.service.IWareSkuService;
import com.muchi.gulimallware.ware.entity.WareSku;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品库存 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"商品库存"})
@RestController
@RequestMapping("/ware-sku")
public class WareSkuController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IWareSkuService wareSkuService;


    @ApiOperation(value = "新增商品库存")
    @PostMapping()
    public int add(@RequestBody WareSku wareSku){
        return wareSkuService.add(wareSku);
    }

    @ApiOperation(value = "删除商品库存")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return wareSkuService.delete(id);
    }

    @ApiOperation(value = "更新商品库存")
    @PutMapping()
    public int update(@RequestBody WareSku wareSku){
        return wareSkuService.updateData(wareSku);
    }

    @ApiOperation(value = "查询商品库存分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<WareSku> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return wareSkuService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品库存")
    @GetMapping("{id}")
    public WareSku findById(@PathVariable Long id){
        return wareSkuService.findById(id);
    }

}
