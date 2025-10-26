package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.NotificationDTO;
import com.campus.CampusShare.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 通知控制器
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/send")
    public Result send(@RequestBody NotificationDTO dto) {
        return notificationService.send(dto);
    }

    @GetMapping("/list")
    public Result list() {
        return notificationService.list();
    }
}