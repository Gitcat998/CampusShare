package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.UserRegisterDTO;
import com.campus.CampusShare.dto.request.UserLoginDTO;

public interface UserService {
    Result register(UserRegisterDTO dto);
    Result login(UserLoginDTO dto);
}