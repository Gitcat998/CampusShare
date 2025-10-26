package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User user);
    boolean existsByUsername(String username);
    User selectByUsername(String username);
}