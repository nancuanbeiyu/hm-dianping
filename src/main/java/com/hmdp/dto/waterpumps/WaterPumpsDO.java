package com.hmdp.dto.waterpumps;

import lombok.*;
import java.util.*;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 冷冻水泵控制模块 DO
 *
 * @author 芋道源码
 */
@TableName("chilled_water_pumps")
@KeySequence("chilled_water_pumps_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WaterPumpsDO   {

    /**
     * id
     */
    @TableId
    private Integer id;
    /**
     * 冷冻水泵变频器名称
     */
    private String name;
    /**
     * 分水器压力
     */
    private Double separatorPressure;
    /**
     * 集水器压力
     */
    private Double collectorPressure;
    /**
     * 流量1
     */
    private Double traffic1;
    /**
     * 流量2
     */
    private Double traffic2;
    /**
     * 流量3
     */
    private Double traffic3;
    /**
     * 冷冻水泵变频器频率
     */
    private Double inverterFrequency1;
    /**
     * 与总控模块通讯（有线通信）
     */
    private Double moduleCommunication;

}