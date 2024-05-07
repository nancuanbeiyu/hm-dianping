package com.hmdp.service.watercontroli;

import com.hmdp.Utility.object.BeanUtils;
import com.hmdp.controller.watercontroli.vo.WaterControlIPageReqVO;
import com.hmdp.controller.watercontroli.vo.WaterControlISaveReqVO;
import com.hmdp.dto.watercontroli.WaterControlIDO;
import com.hmdp.mapper.watercontroli.WaterControlIMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 冷却水系统控制模块-模块1 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class WaterControlIServiceImpl implements WaterControlIService {

    @Resource
    private WaterControlIMapper waterControlIMapper;

    @Override
    public Integer createWaterControlI(WaterControlISaveReqVO createReqVO) {
        // 插入
        WaterControlIDO waterControlI = BeanUtils.toBean(createReqVO, WaterControlIDO.class);
        waterControlIMapper.insert(waterControlI);
        // 返回
        return waterControlI.getId();
    }

    @Override
    public void updateWaterControlI(WaterControlISaveReqVO updateReqVO) {
        // 校验存在
        validateWaterControlIExists(updateReqVO.getId());
        // 更新
        WaterControlIDO updateObj = BeanUtils.toBean(updateReqVO, WaterControlIDO.class);
        waterControlIMapper.updateById(updateObj);
    }

    @Override
    public void deleteWaterControlI(Integer id) {
        // 校验存在
        validateWaterControlIExists(id);
        // 删除
        waterControlIMapper.deleteById(id);
    }

    private void validateWaterControlIExists(Integer id) {
        if (waterControlIMapper.selectById(id) == null) {
          //  throw exception(WATER_CONTROL_I_NOT_EXISTS);
        }
    }

    @Override
    public WaterControlIDO getWaterControlI(Integer id) {
        return waterControlIMapper.selectById(id);
    }

    @Override
    public PageResult<WaterControlIDO> getWaterControlIPage(WaterControlIPageReqVO pageReqVO) {
        return waterControlIMapper.selectPage(pageReqVO);
    }

}