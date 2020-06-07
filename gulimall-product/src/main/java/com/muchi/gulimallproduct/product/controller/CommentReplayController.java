package com.muchi.gulimallproduct.product.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallproduct.product.service.ICommentReplayService;
import com.muchi.gulimallproduct.product.entity.CommentReplay;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品评价回复关系 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-07
 */
@Api(tags = {"商品评价回复关系"})
@RestController
@RequestMapping("/comment-replay")
public class CommentReplayController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private ICommentReplayService commentReplayService;


    @ApiOperation(value = "新增商品评价回复关系")
    @PostMapping()
    public int add(@RequestBody CommentReplay commentReplay){
        return commentReplayService.add(commentReplay);
    }

    @ApiOperation(value = "删除商品评价回复关系")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return commentReplayService.delete(id);
    }

    @ApiOperation(value = "更新商品评价回复关系")
    @PutMapping()
    public int update(@RequestBody CommentReplay commentReplay){
        return commentReplayService.updateData(commentReplay);
    }

    @ApiOperation(value = "查询商品评价回复关系分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<CommentReplay> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return commentReplayService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询商品评价回复关系")
    @GetMapping("{id}")
    public CommentReplay findById(@PathVariable Long id){
        return commentReplayService.findById(id);
    }

}
