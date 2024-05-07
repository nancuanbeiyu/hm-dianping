package com.hmdp.mapper.controlmodule;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import com.hmdp.controller.controlmodule.vo.ControlModulePageReqVO;
import com.hmdp.dto.controlmodule.ControlModuleDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 总控模块 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface ControlModuleMapper extends BaseMapperX<ControlModuleDO> {

    default PageResult<ControlModuleDO> selectPage(ControlModulePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ControlModuleDO>()
                .eqIfPresent(ControlModuleDO::getCommunicationWithThePump, reqVO.getCommunicationWithThePump())
                .eqIfPresent(ControlModuleDO::getCoolingWaterCommunication, reqVO.getCoolingWaterCommunication())
                .eqIfPresent(ControlModuleDO::getUnitWithWaterTemperature, reqVO.getUnitWithWaterTemperature())
                .orderByDesc(ControlModuleDO::getId));
    }

}