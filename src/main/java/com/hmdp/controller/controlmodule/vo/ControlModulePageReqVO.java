package com.hmdp.controller.controlmodule.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

@Schema(description = "管理后台 - 总控模块分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ControlModulePageReqVO extends PageParam {

    @Schema(description = "与冷冻水泵控制模块之间通过有线通讯")
    private String communicationWithThePump;

    @Schema(description = "与冷却水系统控制模块之间通过有线通讯")
    private String coolingWaterCommunication;

    @Schema(description = "制冷机组运行状态及出口水温设定")
    private String unitWithWaterTemperature;

}