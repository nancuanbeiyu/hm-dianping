package com.hmdp.service.watercontrolii;

import com.hmdp.controller.watercontrolii.vo.WaterControlIiPageReqVO;
import com.hmdp.controller.watercontrolii.vo.WaterControlIiSaveReqVO;
import com.hmdp.dto.watercontrolii.WaterControlIiDO;
import com.hmdp.mapper.watercontrolii.WaterControlIiMapper;
import com.hmdp.Utility.object.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import cn.iocoder.yudao.framework.common.pojo.PageResult;


import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;

/**
 * 冷却水系统控制模块_2 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class WaterControlIiServiceImpl implements WaterControlIiService {

    @Resource
    private WaterControlIiMapper waterControlIiMapper;

    @Override
    public Integer createWaterControlIi(WaterControlIiSaveReqVO createReqVO) {
        // 插入
        WaterControlIiDO waterControlIi = BeanUtils.toBean(createReqVO, WaterControlIiDO.class);
        waterControlIiMapper.insert(waterControlIi);
        // 返回
        return waterControlIi.getId();
    }

    @Override
    public void updateWaterControlIi(WaterControlIiSaveReqVO updateReqVO) {
        // 校验存在
        validateWaterControlIiExists(updateReqVO.getId());
        // 更新
        WaterControlIiDO updateObj = BeanUtils.toBean(updateReqVO, WaterControlIiDO.class);
        waterControlIiMapper.updateById(updateObj);
    }

    @Override
    public void deleteWaterControlIi(Integer id) {
        // 校验存在
        validateWaterControlIiExists(id);
        // 删除
        waterControlIiMapper.deleteById(id);
    }

    private void validateWaterControlIiExists(Integer id) {
        if (waterControlIiMapper.selectById(id) == null) {
            //throw exception(WATER_CONTROL_II_NOT_EXISTS);
        }
    }

    @Override
    public WaterControlIiDO getWaterControlIi(Integer id) {
        return waterControlIiMapper.selectById(id);
    }

    @Override
    public PageResult<WaterControlIiDO> getWaterControlIiPage(WaterControlIiPageReqVO pageReqVO) {
        return waterControlIiMapper.selectPage(pageReqVO);
    }

}