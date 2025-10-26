package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.RoleDTO;
import com.campus.CampusShare.entity.Role;
import com.campus.CampusShare.mapper.RoleMapper;
import com.campus.CampusShare.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Result add(RoleDTO dto) {
        Role role = new Role();
        role.setName(dto.getName());
        roleMapper.insert(role);
        return Result.success("角色添加成功");
    }

    @Override
    public Result list() {
        return Result.success("查询成功", roleMapper.selectList());
    }
}