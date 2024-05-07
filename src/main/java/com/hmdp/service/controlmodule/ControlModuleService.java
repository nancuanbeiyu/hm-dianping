package com.hmdp.service.controlmodule;

import java.util.*;
import javax.validation.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import com.hmdp.controller.controlmodule.vo.ControlModulePageReqVO;
import com.hmdp.controller.controlmodule.vo.ControlModuleSaveReqVO;
import com.hmdp.dto.controlmodule.ControlModuleDO;

/**
 * 总控模块 Service 接口
 *
 * @author 芋道源码
 */
public interface ControlModuleService {

    /**
     * 创建总控模块
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Integer createControlModule(@Valid ControlModuleSaveReqVO createReqVO);

    /**
     * 更新总控模块
     *
     * @param updateReqVO 更新信息
     */
    void updateControlModule(@Valid ControlModuleSaveReqVO updateReqVO);

    /**
     * 删除总控模块
     *
     * @param id 编号
     */
    void deleteControlModule(Integer id);

    /**
     * 获得总控模块
     *
     * @param id 编号
     * @return 总控模块
     */
    ControlModuleDO getControlModule(Integer id);

    /**
     * 获得总控模块分页
     *
     * @param pageReqVO 分页查询
     * @return 总控模块分页
     */
    PageResult<ControlModuleDO> getControlModulePage(ControlModulePageReqVO pageReqVO);

}