package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface RoleMapper {
    @Insert("INSERT INTO role (name) VALUES (#{name})")
    int insert(Role role);

    @Select("SELECT * FROM role")
    List<Role> selectList();
}