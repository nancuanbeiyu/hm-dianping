package com.hmdp.controller.waterpumps.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

@Schema(description = "管理后台 - 冷冻水泵控制模块分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WaterPumpsPageReqVO extends PageParam {

    @Schema(description = "冷冻水泵变频器名称", example = "芋艿")
    private String name;

    @Schema(description = "分水器压力")
    private Double separatorPressure;

    @Schema(description = "集水器压力")
    private Double collectorPressure;

    @Schema(description = "流量1")
    private Double traffic1;

    @Schema(description = "流量2")
    private Double traffic2;

    @Schema(description = "流量3")
    private Double traffic3;

    @Schema(description = "冷冻水泵变频器频率")
    private Double inverterFrequency1;

    @Schema(description = "与总控模块通讯（有线通信）")
    private Double moduleCommunication;

}