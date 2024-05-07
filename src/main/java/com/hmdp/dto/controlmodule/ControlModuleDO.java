package com.hmdp.dto.controlmodule;

import lombok.*;
import java.util.*;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 总控模块 DO
 *
 * @author 芋道源码
 */
@TableName("master_control_module")
@KeySequence("master_control_module_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ControlModuleDO  {

    /**
     * id
     */
    @TableId
    private Integer id;
    /**
     * 与冷冻水泵控制模块之间通过有线通讯
     */
    private String communicationWithThePump;
    /**
     * 与冷却水系统控制模块之间通过有线通讯
     */
    private String coolingWaterCommunication;
    /**
     * 制冷机组运行状态及出口水温设定
     */
    private String unitWithWaterTemperature;

}