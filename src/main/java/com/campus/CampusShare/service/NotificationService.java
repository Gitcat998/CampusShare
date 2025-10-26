package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.NotificationDTO;

public interface NotificationService {
    Result send(NotificationDTO dto);
    Result list();
}