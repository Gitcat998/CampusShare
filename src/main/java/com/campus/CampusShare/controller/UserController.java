package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.UserRegisterDTO;
import com.campus.CampusShare.dto.request.UserLoginDTO;
import com.campus.CampusShare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody UserRegisterDTO dto) {
        return userService.register(dto);
    }

    @PostMapping("/login")
    public Result login(@RequestBody UserLoginDTO dto) {
        return userService.login(dto);
    }
}