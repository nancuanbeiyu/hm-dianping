package com.hmdp.controller.waterpumps.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.util.*;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 冷冻水泵控制模块 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WaterPumpsRespVO {

    @Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED, example = "8713")
    @ExcelProperty("id")
    private Integer id;

    @Schema(description = "冷冻水泵变频器名称", example = "芋艿")
    @ExcelProperty("冷冻水泵变频器名称")
    private String name;

    @Schema(description = "分水器压力")
    @ExcelProperty("分水器压力")
    private Double separatorPressure;

    @Schema(description = "集水器压力")
    @ExcelProperty("集水器压力")
    private Double collectorPressure;

    @Schema(description = "流量1")
    @ExcelProperty("流量1")
    private Double traffic1;

    @Schema(description = "流量2")
    @ExcelProperty("流量2")
    private Double traffic2;

    @Schema(description = "流量3")
    @ExcelProperty("流量3")
    private Double traffic3;

    @Schema(description = "冷冻水泵变频器频率")
    @ExcelProperty("冷冻水泵变频器频率")
    private Double inverterFrequency1;

    @Schema(description = "与总控模块通讯（有线通信）")
    @ExcelProperty("与总控模块通讯（有线通信）")
    private Double moduleCommunication;

}