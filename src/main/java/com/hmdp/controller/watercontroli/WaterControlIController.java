package com.hmdp.controller.watercontroli;

import com.hmdp.Utility.object.BeanUtils;
import com.hmdp.controller.watercontroli.vo.WaterControlIPageReqVO;
import com.hmdp.controller.watercontroli.vo.WaterControlIRespVO;
import com.hmdp.controller.watercontroli.vo.WaterControlISaveReqVO;
import com.hmdp.dto.watercontroli.WaterControlIDO;
import com.hmdp.service.watercontroli.WaterControlIService;
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


@Tag(name = "管理后台 - 冷却水系统控制模块-模块1")
@RestController
@RequestMapping("/cooling/water-control-i")
@Validated
public class WaterControlIController {

    @Resource
    private WaterControlIService waterControlIService;

    @PostMapping("/create")
    @Operation(summary = "创建冷却水系统控制模块-模块1")
    @PreAuthorize("@ss.hasPermission('cooling:water-control-i:create')")
    public CommonResult<Integer> createWaterControlI(@Valid @RequestBody WaterControlISaveReqVO createReqVO) {
        return success(waterControlIService.createWaterControlI(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新冷却水系统控制模块-模块1")
    @PreAuthorize("@ss.hasPermission('cooling:water-control-i:update')")
    public CommonResult<Boolean> updateWaterControlI(@Valid @RequestBody WaterControlISaveReqVO updateReqVO) {
        waterControlIService.updateWaterControlI(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除冷却水系统控制模块-模块1")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('cooling:water-control-i:delete')")
    public CommonResult<Boolean> deleteWaterControlI(@RequestParam("id") Integer id) {
        waterControlIService.deleteWaterControlI(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得冷却水系统控制模块-模块1")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('cooling:water-control-i:query')")
    public CommonResult<WaterControlIRespVO> getWaterControlI(@RequestParam("id") Integer id) {
        WaterControlIDO waterControlI = waterControlIService.getWaterControlI(id);
        return success(BeanUtils.toBean(waterControlI, WaterControlIRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得冷却水系统控制模块-模块1分页")
    @PreAuthorize("@ss.hasPermission('cooling:water-control-i:query')")
    public CommonResult<PageResult<WaterControlIRespVO>> getWaterControlIPage(@Valid WaterControlIPageReqVO pageReqVO) {
        PageResult<WaterControlIDO> pageResult = waterControlIService.getWaterControlIPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, WaterControlIRespVO.class));
    }


}