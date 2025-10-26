package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.RoleDTO;
import com.campus.CampusShare.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/add")
    public Result add(@RequestBody RoleDTO dto) {
        return roleService.add(dto);
    }

    @GetMapping("/list")
    public Result list() {
        return roleService.list();
    }
}