package com.hmdp.controller.watercontrolii.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.util.*;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 冷却水系统控制模块_2 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WaterControlIiRespVO {


    private Integer id;

    @Schema(description = "冷却水泵变频器频率")
    @ExcelProperty("冷却水泵变频器频率")
    private Double pumpFrequencyConversion;

    @Schema(description = "制冷机组冷却水出水总温度")
    @ExcelProperty("制冷机组冷却水出水总温度")
    private Double totalEffluentTemperature;

    @Schema(description = "与子模块I之间通过无线通讯")
    @ExcelProperty("与子模块I之间通过无线通讯")
    private String communicatesWithSubmodule;

    @Schema(description = "与总控模块之间通过有线通讯")
    @ExcelProperty("与总控模块之间通过有线通讯")
    private String masterControlCommunication;

    @Schema(description = "与控制模块1之间关联id")
    @ExcelProperty("与控制模块1之间关联id")
    private Integer relevancy;

}