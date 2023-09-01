package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.CmsPrefrenceArea;
import com.macro.mall.service.CmsPrefrenceAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 商品优选管理Controller
 * Created by macro on 2018/6/1.
 */
@RestController
@Api(tags = "CmsPreferenceAreaController")
@Tag(name = "CmsPreferenceAreaController", description = "商品优选管理")
@RequestMapping("/preferenceArea")
@RequiredArgsConstructor
public class CmsPreferenceAreaController {

    private final CmsPrefrenceAreaService preferenceAreaService;

    @ApiOperation("获取所有商品优选")
    @GetMapping("/listAll")
    public CommonResult<List<CmsPrefrenceArea>> listAll() {
        List<CmsPrefrenceArea> prefrenceAreaList = preferenceAreaService.listAll();
        return CommonResult.success(prefrenceAreaList);
    }
}
