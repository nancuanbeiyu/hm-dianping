package com.hmdp.dto;

import lombok.Data;

@Data
public class frequencyDO {
    private int id;
    private String name;
    private byte initiate;
    private double frequency;
    private byte enable;
    private byte correspondence;
    private byte ioControl;
    private int controlFlagBits;
}
