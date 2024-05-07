package com.hmdp.service.controlmodule;

import com.hmdp.Utility.object.BeanUtils;
import com.hmdp.controller.controlmodule.vo.ControlModulePageReqVO;
import com.hmdp.controller.controlmodule.vo.ControlModuleSaveReqVO;
import com.hmdp.dto.controlmodule.ControlModuleDO;
import com.hmdp.mapper.controlmodule.ControlModuleMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;


import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;

/**
 * 总控模块 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class ControlModuleServiceImpl implements ControlModuleService {

    @Resource
    private ControlModuleMapper controlModuleMapper;

    @Override
    public Integer createControlModule(ControlModuleSaveReqVO createReqVO) {
        // 插入
        ControlModuleDO controlModule = BeanUtils.toBean(createReqVO, ControlModuleDO.class);
        controlModuleMapper.insert(controlModule);
        // 返回
        return controlModule.getId();
    }

    @Override
    public void updateControlModule(ControlModuleSaveReqVO updateReqVO) {
        // 校验存在
        validateControlModuleExists(updateReqVO.getId());
        // 更新
        ControlModuleDO updateObj = BeanUtils.toBean(updateReqVO, ControlModuleDO.class);
        controlModuleMapper.updateById(updateObj);
    }

    @Override
    public void deleteControlModule(Integer id) {
        // 校验存在
        validateControlModuleExists(id);
        // 删除
        controlModuleMapper.deleteById(id);
    }

    private void validateControlModuleExists(Integer id) {
        if (controlModuleMapper.selectById(id) == null) {
            //throw exception(CONTROL_MODULE_NOT_EXISTS);
        }
    }

    @Override
    public ControlModuleDO getControlModule(Integer id) {
        return controlModuleMapper.selectById(id);
    }

    @Override
    public PageResult<ControlModuleDO> getControlModulePage(ControlModulePageReqVO pageReqVO) {
        return controlModuleMapper.selectPage(pageReqVO);
    }

}