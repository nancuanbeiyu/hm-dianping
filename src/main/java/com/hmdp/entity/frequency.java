package com.hmdp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("frequency_converters_control")
public class frequency  implements Serializable {
    private int id;
    //启动
    private byte initiate;
    //频率
    private double frequency;
    //启用
    private byte enable;
    private String name;
    private byte correspondence;
    private byte ioControl;
    private int controlFlagBits;
}
