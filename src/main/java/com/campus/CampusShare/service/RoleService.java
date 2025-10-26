package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.RoleDTO;

public interface RoleService {
    Result add(RoleDTO dto);
    Result list();
}