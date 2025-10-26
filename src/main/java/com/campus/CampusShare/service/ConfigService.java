package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ConfigDTO;

/**
 * 配置服务接口
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
public interface ConfigService {
    Result update(ConfigDTO dto);
    Result get();
}