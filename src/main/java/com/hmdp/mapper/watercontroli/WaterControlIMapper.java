package com.hmdp.mapper.watercontroli;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import com.hmdp.controller.watercontroli.vo.WaterControlIPageReqVO;
import com.hmdp.dto.watercontroli.WaterControlIDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 冷却水系统控制模块-模块1 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface WaterControlIMapper extends BaseMapperX<WaterControlIDO> {

    default PageResult<WaterControlIDO> selectPage(WaterControlIPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<WaterControlIDO>()
                .eqIfPresent(WaterControlIDO::getWaterTemperature, reqVO.getWaterTemperature())
                .eqIfPresent(WaterControlIDO::getBallTemperature, reqVO.getBallTemperature())
                .eqIfPresent(WaterControlIDO::getCoolingTowerTemperature1, reqVO.getCoolingTowerTemperature1())
                .eqIfPresent(WaterControlIDO::getCoolingEffluentTemperature1, reqVO.getCoolingEffluentTemperature1())
                .eqIfPresent(WaterControlIDO::getCoolingTowerTemperature2, reqVO.getCoolingTowerTemperature2())
                .eqIfPresent(WaterControlIDO::getCoolingEffluentTemperature2, reqVO.getCoolingEffluentTemperature2())
                .eqIfPresent(WaterControlIDO::getCoolingTowerTemperature3, reqVO.getCoolingTowerTemperature3())
                .eqIfPresent(WaterControlIDO::getCoolingEffluentTemperature3, reqVO.getCoolingEffluentTemperature3())
                .eqIfPresent(WaterControlIDO::getInverterFrequency1, reqVO.getInverterFrequency1())
                .eqIfPresent(WaterControlIDO::getInverterFrequency2, reqVO.getInverterFrequency2())
                .eqIfPresent(WaterControlIDO::getInverterFrequency3, reqVO.getInverterFrequency3())
                .eqIfPresent(WaterControlIDO::getCommunicateWithSubmodulesIi, reqVO.getCommunicateWithSubmodulesIi())
                .orderByDesc(WaterControlIDO::getId));
    }

}