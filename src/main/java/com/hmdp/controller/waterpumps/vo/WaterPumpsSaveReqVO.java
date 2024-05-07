package com.hmdp.controller.waterpumps.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 冷冻水泵控制模块新增/修改 Request VO")
@Data
public class WaterPumpsSaveReqVO {

    @Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED, example = "8713")
    private Integer id;

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