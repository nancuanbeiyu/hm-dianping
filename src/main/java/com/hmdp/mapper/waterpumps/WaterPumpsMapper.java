package com.hmdp.mapper.waterpumps;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import com.hmdp.controller.waterpumps.vo.WaterPumpsPageReqVO;
import com.hmdp.dto.waterpumps.WaterPumpsDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 冷冻水泵控制模块 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface WaterPumpsMapper extends BaseMapperX<WaterPumpsDO> {

    default PageResult<WaterPumpsDO> selectPage(WaterPumpsPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<WaterPumpsDO>()
                .likeIfPresent(WaterPumpsDO::getName, reqVO.getName())
                .eqIfPresent(WaterPumpsDO::getSeparatorPressure, reqVO.getSeparatorPressure())
                .eqIfPresent(WaterPumpsDO::getCollectorPressure, reqVO.getCollectorPressure())
                .eqIfPresent(WaterPumpsDO::getTraffic1, reqVO.getTraffic1())
                .eqIfPresent(WaterPumpsDO::getTraffic2, reqVO.getTraffic2())
                .eqIfPresent(WaterPumpsDO::getTraffic3, reqVO.getTraffic3())
                .eqIfPresent(WaterPumpsDO::getInverterFrequency1, reqVO.getInverterFrequency1())
                .eqIfPresent(WaterPumpsDO::getModuleCommunication, reqVO.getModuleCommunication())
                .orderByDesc(WaterPumpsDO::getId));
    }

}