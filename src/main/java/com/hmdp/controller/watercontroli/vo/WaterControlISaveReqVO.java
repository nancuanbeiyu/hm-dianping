package com.hmdp.controller.watercontroli.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 冷却水系统控制模块-模块1新增/修改 Request VO")
@Data
public class WaterControlISaveReqVO {

    @Schema(description = "id ", requiredMode = Schema.RequiredMode.REQUIRED, example = "12842")
    private Integer id;

    @Schema(description = "冷却塔总进水温度")
    private String waterTemperature;

    @Schema(description = "室外干湿球温度")
    private String ballTemperature;

    @Schema(description = "冷却塔出风温度1")
    private String coolingTowerTemperature1;

    @Schema(description = "冷却塔出水温度1")
    private String coolingEffluentTemperature1;

    @Schema(description = "冷却塔出风温度2")
    private String coolingTowerTemperature2;

    @Schema(description = "冷却塔出水温度2")
    private String coolingEffluentTemperature2;

    @Schema(description = "冷却塔出风温度3")
    private String coolingTowerTemperature3;

    @Schema(description = "冷却塔出水温度3 ")
    private String coolingEffluentTemperature3;

    @Schema(description = "冷却塔变频器频率1")
    private String inverterFrequency1;

    @Schema(description = "冷却塔变频器频率2")
    private String inverterFrequency2;

    @Schema(description = "冷却塔变频器频率3")
    private String inverterFrequency3;

    @Schema(description = "与子模块II之间通过无线进行通讯")
    private String communicateWithSubmodulesIi;

}