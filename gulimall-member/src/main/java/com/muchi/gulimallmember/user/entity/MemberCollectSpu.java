package com.muchi.gulimallmember.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员收藏的商品
 * </p>
 *
 * @author yuzq
 * @since 2020-06-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_member_collect_spu")
@ApiModel(value="MemberCollectSpu对象", description="会员收藏的商品")
public class MemberCollectSpu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "会员id")
    private Long memberId;

    @ApiModelProperty(value = "spu_id")
    private Long spuId;

    @ApiModelProperty(value = "spu_name")
    private String spuName;

    @ApiModelProperty(value = "spu_img")
    private String spuImg;

    @ApiModelProperty(value = "create_time")
    private Date createTime;


}
