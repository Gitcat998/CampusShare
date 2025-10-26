package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ItemTypeDTO;
import com.campus.CampusShare.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 物品类型控制器
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@RestController
@RequestMapping("/api/itemType")
public class ItemTypeController {

    @Autowired
    private ItemTypeService itemTypeService;

    @PostMapping("/add")
    public Result add(@RequestBody ItemTypeDTO dto) {
        return itemTypeService.add(dto);
    }

    @GetMapping("/list")
    public Result list() {
        return itemTypeService.list();
    }
}