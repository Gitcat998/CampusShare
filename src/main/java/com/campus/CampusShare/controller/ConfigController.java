package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ConfigDTO;
import com.campus.CampusShare.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 配置控制器
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@RestController
@RequestMapping("/api/config")
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @PostMapping("/update")
    public Result update(@RequestBody ConfigDTO dto) {
        return configService.update(dto);
    }

    @GetMapping("/get")
    public Result get() {
        return configService.get();
    }
}