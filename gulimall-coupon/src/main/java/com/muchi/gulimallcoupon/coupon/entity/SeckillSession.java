package com.muchi.gulimallcoupon.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 秒杀活动场次
 * </p>
 *
 * @author yuzq
 * @since 2020-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sms_seckill_session")
@ApiModel(value="SeckillSession对象", description="秒杀活动场次")
public class SeckillSession implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "场次名称")
    private String name;

    @ApiModelProperty(value = "每日开始时间")
    private Date startTime;

    @ApiModelProperty(value = "每日结束时间")
    private Date endTime;

    @ApiModelProperty(value = "启用状态")
    private Boolean status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}
