package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.UserRegisterDTO;
import com.campus.CampusShare.dto.request.UserLoginDTO;
import com.campus.CampusShare.entity.User;
import com.campus.CampusShare.mapper.UserMapper;
import com.campus.CampusShare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.campus.CampusShare.util.JwtUtil;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Result register(UserRegisterDTO dto) {
        // 校验用户名是否已存在
        if (userMapper.existsByUsername(dto.getUsername())) {
            return Result.error("用户名已存在");
        }
        // 密码加密
        String encryptedPwd = passwordEncoder.encode(dto.getPassword());
        // 创建用户
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(encryptedPwd);
        user.setRoleId(1L); // 默认学生角色
        userMapper.insert(user);
        return Result.success("注册成功");
    }

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public Result login(UserLoginDTO dto) {
        // 查询用户
        User user = userMapper.selectByUsername(dto.getUsername());
        if (user == null || !passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
            return Result.error("用户名或密码错误");
        }
        // 生成 JWT 令牌
        String token = jwtUtil.generateToken(user.getId(), user.getUsername());
        return Result.success(token);
    }
}