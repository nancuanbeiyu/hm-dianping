package com.hmdp.controller.controlmodule.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 总控模块新增/修改 Request VO")
@Data
public class ControlModuleSaveReqVO {

    @Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED, example = "14332")
    private Integer id;

    @Schema(description = "与冷冻水泵控制模块之间通过有线通讯")
    private String communicationWithThePump;

    @Schema(description = "与冷却水系统控制模块之间通过有线通讯")
    private String coolingWaterCommunication;

    @Schema(description = "制冷机组运行状态及出口水温设定")
    private String unitWithWaterTemperature;

}