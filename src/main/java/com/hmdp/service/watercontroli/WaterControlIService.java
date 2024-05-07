package com.hmdp.service.watercontroli;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import com.hmdp.controller.watercontroli.vo.WaterControlIPageReqVO;
import com.hmdp.controller.watercontroli.vo.WaterControlISaveReqVO;
import com.hmdp.dto.watercontroli.WaterControlIDO;

/**
 * 冷却水系统控制模块-模块1 Service 接口
 *
 * @author 芋道源码
 */
public interface WaterControlIService {

    /**
     * 创建冷却水系统控制模块-模块1
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Integer createWaterControlI(@Valid WaterControlISaveReqVO createReqVO);

    /**
     * 更新冷却水系统控制模块-模块1
     *
     * @param updateReqVO 更新信息
     */
    void updateWaterControlI(@Valid WaterControlISaveReqVO updateReqVO);

    /**
     * 删除冷却水系统控制模块-模块1
     *
     * @param id 编号
     */
    void deleteWaterControlI(Integer id);

    /**
     * 获得冷却水系统控制模块-模块1
     *
     * @param id 编号
     * @return 冷却水系统控制模块-模块1
     */
    WaterControlIDO getWaterControlI(Integer id);

    /**
     * 获得冷却水系统控制模块-模块1分页
     *
     * @param pageReqVO 分页查询
     * @return 冷却水系统控制模块-模块1分页
     */
    PageResult<WaterControlIDO> getWaterControlIPage(WaterControlIPageReqVO pageReqVO);

}