package com.hmdp.service.watercontrolii;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import com.hmdp.controller.watercontrolii.vo.WaterControlIiPageReqVO;
import com.hmdp.controller.watercontrolii.vo.WaterControlIiSaveReqVO;
import com.hmdp.dto.watercontrolii.WaterControlIiDO;

/**
 * 冷却水系统控制模块_2 Service 接口
 *
 * @author 芋道源码
 */
public interface WaterControlIiService {

    /**
     * 创建冷却水系统控制模块_2
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Integer createWaterControlIi( WaterControlIiSaveReqVO createReqVO);

    /**
     * 更新冷却水系统控制模块_2
     *
     * @param updateReqVO 更新信息
     */
    void updateWaterControlIi( WaterControlIiSaveReqVO updateReqVO);

    /**
     * 删除冷却水系统控制模块_2
     *
     * @param id 编号
     */
    void deleteWaterControlIi(Integer id);

    /**
     * 获得冷却水系统控制模块_2
     *
     * @param id 编号
     * @return 冷却水系统控制模块_2
     */
    WaterControlIiDO getWaterControlIi(Integer id);

    /**
     * 获得冷却水系统控制模块_2分页
     *
     * @param pageReqVO 分页查询
     * @return 冷却水系统控制模块_2分页
     */
    PageResult<WaterControlIiDO> getWaterControlIiPage(WaterControlIiPageReqVO pageReqVO);

}