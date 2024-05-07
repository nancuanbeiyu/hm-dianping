package com.hmdp.controller.watercontrolii;

import com.hmdp.controller.watercontrolii.vo.WaterControlIiRespVO;
import com.hmdp.controller.watercontrolii.vo.WaterControlIiSaveReqVO;
import com.hmdp.dto.watercontrolii.WaterControlIiDO;
import com.hmdp.Utility.object.BeanUtils;
import com.hmdp.service.watercontrolii.WaterControlIiService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;


import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;


@Tag(name = "管理后台 - 冷却水系统控制模块_2")
@RestController
@RequestMapping("/cooling/water-control-ii")
@Validated
public class WaterControlIiController {

    @Resource
    private WaterControlIiService waterControlIiService;

    @PostMapping("/create")
    @Operation(summary = "创建冷却水系统控制模块_2")
    @PreAuthorize("@ss.hasPermission('cooling:water-control-ii:create')")
    public CommonResult<Integer> createWaterControlIi( @RequestBody WaterControlIiSaveReqVO createReqVO) {
        return success(waterControlIiService.createWaterControlIi(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新冷却水系统控制模块_2")
    @PreAuthorize("@ss.hasPermission('cooling:water-control-ii:update')")
    public CommonResult<Boolean> updateWaterControlIi( @RequestBody WaterControlIiSaveReqVO updateReqVO) {
        waterControlIiService.updateWaterControlIi(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除冷却水系统控制模块_2")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('cooling:water-control-ii:delete')")
    public CommonResult<Boolean> deleteWaterControlIi(@RequestParam("id") Integer id) {
        waterControlIiService.deleteWaterControlIi(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得冷却水系统控制模块_2")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('cooling:water-control-ii:query')")
    public CommonResult<WaterControlIiRespVO> getWaterControlIi(@RequestParam("id") Integer id) {
        WaterControlIiDO waterControlIi = waterControlIiService.getWaterControlIi(id);
        return success(BeanUtils.toBean(waterControlIi, WaterControlIiRespVO.class));
    }




}