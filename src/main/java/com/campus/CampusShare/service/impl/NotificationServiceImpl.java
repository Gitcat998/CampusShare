package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.NotificationDTO;
import com.campus.CampusShare.entity.Notification;
import com.campus.CampusShare.mapper.NotificationMapper;
import com.campus.CampusShare.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;

    @Override
    public Result send(NotificationDTO dto) {
        Notification notification = new Notification();
        notification.setTitle(dto.getTitle());
        notification.setContent(dto.getContent());
        notification.setReceiverId(dto.getReceiverId());
        notificationMapper.insert(notification);
        return Result.success("通知发送成功");
    }

    @Override
    public Result list() {
        return Result.success("查询成功", notificationMapper.selectList());
    }
}