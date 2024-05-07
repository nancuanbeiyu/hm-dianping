package com.hmdp.service.waterpumps;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import com.hmdp.Utility.object.BeanUtils;
import com.hmdp.controller.waterpumps.vo.WaterPumpsPageReqVO;
import com.hmdp.controller.waterpumps.vo.WaterPumpsSaveReqVO;
import com.hmdp.dto.waterpumps.WaterPumpsDO;
import com.hmdp.mapper.waterpumps.WaterPumpsMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;




import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;

/**
 * 冷冻水泵控制模块 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class WaterPumpsServiceImpl implements WaterPumpsService {

    @Resource
    private WaterPumpsMapper waterPumpsMapper;

    @Override
    public Integer createWaterPumps(WaterPumpsSaveReqVO createReqVO) {
        // 插入
        WaterPumpsDO waterPumps = BeanUtils.toBean(createReqVO, WaterPumpsDO.class);
        waterPumpsMapper.insert(waterPumps);
        // 返回
        return waterPumps.getId();
    }

    @Override
    public void updateWaterPumps(WaterPumpsSaveReqVO updateReqVO) {
        // 校验存在
        validateWaterPumpsExists(updateReqVO.getId());
        // 更新
        WaterPumpsDO updateObj = BeanUtils.toBean(updateReqVO, WaterPumpsDO.class);
        waterPumpsMapper.updateById(updateObj);
    }

    @Override
    public void deleteWaterPumps(Integer id) {
        // 校验存在
        validateWaterPumpsExists(id);
        // 删除
        waterPumpsMapper.deleteById(id);
    }

    private void validateWaterPumpsExists(Integer id) {
        if (waterPumpsMapper.selectById(id) == null) {
            //throw exception(WATER_PUMPS_NOT_EXISTS);
        }
    }

    @Override
    public WaterPumpsDO getWaterPumps(Integer id) {
        return waterPumpsMapper.selectById(id);
    }

    @Override
    public PageResult<WaterPumpsDO> getWaterPumpsPage(WaterPumpsPageReqVO pageReqVO) {
        return waterPumpsMapper.selectPage(pageReqVO);
    }

}