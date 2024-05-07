package com.hmdp.mapper.watercontrolii;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
 import com.hmdp.controller.watercontrolii.vo.WaterControlIiPageReqVO;
import com.hmdp.dto.watercontrolii.WaterControlIiDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 冷却水系统控制模块_2 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface WaterControlIiMapper extends BaseMapperX<WaterControlIiDO> {

    default PageResult<WaterControlIiDO> selectPage(WaterControlIiPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<WaterControlIiDO>()
                .eqIfPresent(WaterControlIiDO::getPumpFrequencyConversion, reqVO.getPumpFrequencyConversion())
                .eqIfPresent(WaterControlIiDO::getTotalEffluentTemperature, reqVO.getTotalEffluentTemperature())
                .eqIfPresent(WaterControlIiDO::getCommunicatesWithSubmodule, reqVO.getCommunicatesWithSubmodule())
                .eqIfPresent(WaterControlIiDO::getMasterControlCommunication, reqVO.getMasterControlCommunication())
                .eqIfPresent(WaterControlIiDO::getRelevancy, reqVO.getRelevancy())
                .orderByDesc(WaterControlIiDO::getId));
    }

}