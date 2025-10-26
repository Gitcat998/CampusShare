package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.RoleDTO;

/**
 * 角色服务接口
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
public interface RoleService {
    Result add(RoleDTO dto);
    Result list();
}