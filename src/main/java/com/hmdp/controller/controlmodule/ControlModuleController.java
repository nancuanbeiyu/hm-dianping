package com.hmdp.controller.controlmodule;

import com.hmdp.Utility.object.BeanUtils;
import com.hmdp.controller.controlmodule.vo.ControlModulePageReqVO;
import com.hmdp.controller.controlmodule.vo.ControlModuleRespVO;
import com.hmdp.controller.controlmodule.vo.ControlModuleSaveReqVO;
import com.hmdp.dto.controlmodule.ControlModuleDO;
import com.hmdp.service.controlmodule.ControlModuleService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import javax.validation.constraints.*;
import javax.validation.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;



@Tag(name = "管理后台 - 总控模块")
@RestController
@RequestMapping("/master/control-module")
@Validated
public class ControlModuleController {

    @Resource
    private ControlModuleService controlModuleService;

    @PostMapping("/create")
    @Operation(summary = "创建总控模块")
    @PreAuthorize("@ss.hasPermission('master:control-module:create')")
    public CommonResult<Integer> createControlModule(@Valid @RequestBody ControlModuleSaveReqVO createReqVO) {
        return success(controlModuleService.createControlModule(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新总控模块")
    @PreAuthorize("@ss.hasPermission('master:control-module:update')")
    public CommonResult<Boolean> updateControlModule(@Valid @RequestBody ControlModuleSaveReqVO updateReqVO) {
        controlModuleService.updateControlModule(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除总控模块")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('master:control-module:delete')")
    public CommonResult<Boolean> deleteControlModule(@RequestParam("id") Integer id) {
        controlModuleService.deleteControlModule(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得总控模块")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('master:control-module:query')")
    public CommonResult<ControlModuleRespVO> getControlModule(@RequestParam("id") Integer id) {
        ControlModuleDO controlModule = controlModuleService.getControlModule(id);
        return success(BeanUtils.toBean(controlModule, ControlModuleRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得总控模块分页")
    @PreAuthorize("@ss.hasPermission('master:control-module:query')")
    public CommonResult<PageResult<ControlModuleRespVO>> getControlModulePage(@Valid ControlModulePageReqVO pageReqVO) {
        PageResult<ControlModuleDO> pageResult = controlModuleService.getControlModulePage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ControlModuleRespVO.class));
    }



}