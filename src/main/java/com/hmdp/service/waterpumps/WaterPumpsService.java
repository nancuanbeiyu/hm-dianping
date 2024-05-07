package com.hmdp.service.waterpumps;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import com.hmdp.controller.waterpumps.vo.WaterPumpsPageReqVO;
import com.hmdp.controller.waterpumps.vo.WaterPumpsSaveReqVO;
import com.hmdp.dto.waterpumps.WaterPumpsDO;

/**
 * 冷冻水泵控制模块 Service 接口
 *
 * @author 芋道源码
 */
public interface WaterPumpsService {

    /**
     * 创建冷冻水泵控制模块
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Integer createWaterPumps(@Valid WaterPumpsSaveReqVO createReqVO);

    /**
     * 更新冷冻水泵控制模块
     *
     * @param updateReqVO 更新信息
     */
    void updateWaterPumps(@Valid WaterPumpsSaveReqVO updateReqVO);

    /**
     * 删除冷冻水泵控制模块
     *
     * @param id 编号
     */
    void deleteWaterPumps(Integer id);

    /**
     * 获得冷冻水泵控制模块
     *
     * @param id 编号
     * @return 冷冻水泵控制模块
     */
    WaterPumpsDO getWaterPumps(Integer id);

    /**
     * 获得冷冻水泵控制模块分页
     *
     * @param pageReqVO 分页查询
     * @return 冷冻水泵控制模块分页
     */
    PageResult<WaterPumpsDO> getWaterPumpsPage(WaterPumpsPageReqVO pageReqVO);

}