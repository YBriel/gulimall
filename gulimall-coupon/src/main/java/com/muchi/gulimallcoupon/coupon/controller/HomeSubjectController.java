package com.muchi.gulimallcoupon.coupon.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallcoupon.coupon.service.IHomeSubjectService;
import com.muchi.gulimallcoupon.coupon.entity.HomeSubject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Api(tags = {"首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】"})
@RestController
@RequestMapping("/home-subject")
public class HomeSubjectController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IHomeSubjectService homeSubjectService;


    @ApiOperation(value = "新增首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】")
    @PostMapping()
    public int add(@RequestBody HomeSubject homeSubject){
        return homeSubjectService.add(homeSubject);
    }

    @ApiOperation(value = "删除首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return homeSubjectService.delete(id);
    }

    @ApiOperation(value = "更新首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】")
    @PutMapping()
    public int update(@RequestBody HomeSubject homeSubject){
        return homeSubjectService.updateData(homeSubject);
    }

    @ApiOperation(value = "查询首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<HomeSubject> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return homeSubjectService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】")
    @GetMapping("{id}")
    public HomeSubject findById(@PathVariable Long id){
        return homeSubjectService.findById(id);
    }

}
