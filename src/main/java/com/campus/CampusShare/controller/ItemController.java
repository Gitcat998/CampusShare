package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ItemPublishDTO;
import com.campus.CampusShare.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 物品控制器
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/publish")
    public Result publish(@RequestBody ItemPublishDTO dto) {
        return itemService.publish(dto);
    }
}