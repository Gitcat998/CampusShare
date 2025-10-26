package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ConfigDTO;

public interface ConfigService {
    Result update(ConfigDTO dto);
    Result get();
}