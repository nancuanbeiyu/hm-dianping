package com.hmdp.controller.waterpumps;

import com.hmdp.Utility.object.BeanUtils;
import com.hmdp.controller.waterpumps.vo.WaterPumpsPageReqVO;
import com.hmdp.controller.waterpumps.vo.WaterPumpsRespVO;
import com.hmdp.controller.waterpumps.vo.WaterPumpsSaveReqVO;
import com.hmdp.dto.waterpumps.WaterPumpsDO;
import com.hmdp.service.waterpumps.WaterPumpsService;
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



@Tag(name = "管理后台 - 冷冻水泵控制模块")
@RestController
@RequestMapping("/chilled/water-pumps")
@Validated
public class WaterPumpsController {

    @Resource
    private WaterPumpsService waterPumpsService;

    @PostMapping("/create")
    @Operation(summary = "创建冷冻水泵控制模块")
    @PreAuthorize("@ss.hasPermission('chilled:water-pumps:create')")
    public CommonResult<Integer> createWaterPumps(@Valid @RequestBody WaterPumpsSaveReqVO createReqVO) {
        return success(waterPumpsService.createWaterPumps(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新冷冻水泵控制模块")
    @PreAuthorize("@ss.hasPermission('chilled:water-pumps:update')")
    public CommonResult<Boolean> updateWaterPumps(@Valid @RequestBody WaterPumpsSaveReqVO updateReqVO) {
        waterPumpsService.updateWaterPumps(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除冷冻水泵控制模块")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('chilled:water-pumps:delete')")
    public CommonResult<Boolean> deleteWaterPumps(@RequestParam("id") Integer id) {
        waterPumpsService.deleteWaterPumps(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得冷冻水泵控制模块")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('chilled:water-pumps:query')")
    public CommonResult<WaterPumpsRespVO> getWaterPumps(@RequestParam("id") Integer id) {
        WaterPumpsDO waterPumps = waterPumpsService.getWaterPumps(id);
        return success(BeanUtils.toBean(waterPumps, WaterPumpsRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得冷冻水泵控制模块分页")
    @PreAuthorize("@ss.hasPermission('chilled:water-pumps:query')")
    public CommonResult<PageResult<WaterPumpsRespVO>> getWaterPumpsPage(@Valid WaterPumpsPageReqVO pageReqVO) {
        PageResult<WaterPumpsDO> pageResult = waterPumpsService.getWaterPumpsPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, WaterPumpsRespVO.class));
    }



}