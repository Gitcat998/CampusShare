package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ItemPublishDTO;

public interface ItemService {
    Result publish(ItemPublishDTO dto);
}