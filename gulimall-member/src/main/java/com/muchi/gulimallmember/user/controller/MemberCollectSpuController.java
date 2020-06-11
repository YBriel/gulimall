package com.muchi.gulimallmember.user.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.muchi.gulimallmember.user.service.IMemberCollectSpuService;
import com.muchi.gulimallmember.user.entity.MemberCollectSpu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员收藏的商品 前端控制器
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Api(tags = {"会员收藏的商品"})
@RestController
@RequestMapping("/member-collect-spu")
public class MemberCollectSpuController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private IMemberCollectSpuService memberCollectSpuService;


    @ApiOperation(value = "新增会员收藏的商品")
    @PostMapping()
    public int add(@RequestBody MemberCollectSpu memberCollectSpu){
        return memberCollectSpuService.add(memberCollectSpu);
    }

    @ApiOperation(value = "删除会员收藏的商品")
    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") Long id){
        return memberCollectSpuService.delete(id);
    }

    @ApiOperation(value = "更新会员收藏的商品")
    @PutMapping()
    public int update(@RequestBody MemberCollectSpu memberCollectSpu){
        return memberCollectSpuService.updateData(memberCollectSpu);
    }

    @ApiOperation(value = "查询会员收藏的商品分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @GetMapping()
    public IPage<MemberCollectSpu> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return memberCollectSpuService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询会员收藏的商品")
    @GetMapping("{id}")
    public MemberCollectSpu findById(@PathVariable Long id){
        return memberCollectSpuService.findById(id);
    }

}
