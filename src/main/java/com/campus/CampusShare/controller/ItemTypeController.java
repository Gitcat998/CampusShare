package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ItemTypeDTO;
import com.campus.CampusShare.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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