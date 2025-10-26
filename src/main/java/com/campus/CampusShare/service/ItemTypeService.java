package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ItemTypeDTO;

public interface ItemTypeService {
    Result add(ItemTypeDTO dto);
    Result list();
}