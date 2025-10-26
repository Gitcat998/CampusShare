package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface RoleMapper {
    int insert(Role role);
    List<Role> selectList();
}