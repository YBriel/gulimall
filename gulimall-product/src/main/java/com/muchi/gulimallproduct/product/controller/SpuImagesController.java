package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ISpuImagesService;
import com.muchi.gulimallproduct.product.entity.SpuImages;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * spu图片 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"spu图片"})
@RestController
@RequestMapping("/spu-images")
public class SpuImagesController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ISpuImagesService spuImagesService;


    @ApiOperation(value = "新增spu图片")
    @PostMapping()
    public int add(@RequestBody SpuImages spuImages){
        return spuImagesService.add(spuImages);
    }

    @ApiOperation(value = "删除spu图片")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return spuImagesService.delete(id);
    }

    @ApiOperation(value = "更新spu图片")
    @PutMapping()
    public int update(@RequestBody SpuImages spuImages){
        return spuImagesService.updateData(spuImages);
    }

    @ApiOperation(value = "查询spu图片分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<SpuImages> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return spuImagesService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询spu图片")
    @GetMapping("{id}")
    public SpuImages findById(@PathVariable Long id){
        return spuImagesService.findById(id);
    }

}
