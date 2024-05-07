package com.hmdp.dto.watercontrolii;

import lombok.*;
import java.util.*;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 冷却水系统控制模块_2 DO
 *
 * @author 芋道源码
 */
@TableName("cooling_water_control_ii")
@KeySequence("cooling_water_control_ii_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WaterControlIiDO  {

    /**
     * id

     */
    @TableId
    private Integer id;
    /**
     * 冷却水泵变频器频率
     */
    private Double pumpFrequencyConversion;
    /**
     * 制冷机组冷却水出水总温度
     */
    private Double totalEffluentTemperature;
    /**
     * 与子模块I之间通过无线通讯
     */
    private String communicatesWithSubmodule;
    /**
     * 与总控模块之间通过有线通讯
     */
    private String masterControlCommunication;
    /**
     * 与控制模块1之间关联id
     */
    private Integer relevancy;

}