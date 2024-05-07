package com.hmdp.dto.watercontroli;

import lombok.*;
import java.util.*;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 冷却水系统控制模块-模块1 DO
 *
 * @author 芋道源码
 */
@TableName("cooling_water_control_i")
@KeySequence("cooling_water_control_i_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WaterControlIDO   {

    /**
     * id

     */
    @TableId
    private Integer id;
    /**
     * 冷却塔总进水温度
     */
    private String waterTemperature;
    /**
     * 室外干湿球温度
     */
    private String ballTemperature;
    /**
     * 冷却塔出风温度1
     */
    private String coolingTowerTemperature1;
    /**
     * 冷却塔出水温度1
     */
    private String coolingEffluentTemperature1;
    /**
     * 冷却塔出风温度2
     */
    private String coolingTowerTemperature2;
    /**
     * 冷却塔出水温度2
     */
    private String coolingEffluentTemperature2;
    /**
     * 冷却塔出风温度3
     */
    private String coolingTowerTemperature3;
    /**
     * 冷却塔出水温度3

     */
    private String coolingEffluentTemperature3;
    /**
     * 冷却塔变频器频率1
     */
    private String inverterFrequency1;
    /**
     * 冷却塔变频器频率2
     */
    private String inverterFrequency2;
    /**
     * 冷却塔变频器频率3
     */
    private String inverterFrequency3;
    /**
     * 与子模块II之间通过无线进行通讯
     */
    private String communicateWithSubmodulesIi;

}