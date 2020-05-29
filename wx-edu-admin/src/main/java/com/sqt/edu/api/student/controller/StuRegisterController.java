package com.sqt.edu.api.student.controller;

import com.sqt.edu.api.student.service.StuRegisterInfoService;
import com.sqt.edu.base.JsonResult;
import com.sqt.edu.dto.request.QueryStuRegisterInfoDTO;
import com.sqt.edu.dto.request.StuRegisterInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-02-13 23:23
 */
@Api(tags = "【学生报名信息接口】")
@RestController
@RequestMapping("/student/class_order")
public class StuRegisterController {

    @Autowired
    private StuRegisterInfoService stuRegisterInfoService;

    @ApiOperation(value = "S-1.1-学生预约报名接口")
    @PostMapping("/add")
    public JsonResult add(@RequestBody @Valid StuRegisterInfoDTO stuRegisterInfoDTO){
        return stuRegisterInfoService.add(stuRegisterInfoDTO);
    }
    @ApiOperation(value = "S-1.2-查询报名信息接口")
    @GetMapping("/query")
    public JsonResult queryStuRegisterInfo(@RequestParam @Valid String phone,
            @RequestParam Integer year){
        return stuRegisterInfoService.queryStuRegisterInfo(phone,year);
    }
    @ApiOperation(value = "S-1.3-列表")
    @PostMapping("/list")
    public JsonResult list(@RequestBody QueryStuRegisterInfoDTO queryStuRegisterInfoDTO){
        return stuRegisterInfoService.queryStuRegisterInfoList(queryStuRegisterInfoDTO);
    }
    @ApiOperation("导出excel")
    @PostMapping("/exportExcel")
    public void exportExcel(@RequestBody List<Long> ids) {
        stuRegisterInfoService.exportExcel(ids);
    }
}
