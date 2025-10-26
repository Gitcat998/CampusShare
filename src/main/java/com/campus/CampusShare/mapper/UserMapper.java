package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (username, password, role_id, create_time, update_time, is_delete) " +
            "VALUES (#{username}, #{password}, #{roleId}, #{createTime}, #{updateTime}, #{isDelete})")
    int insert(User user);

    @Select("SELECT COUNT(*) > 0 FROM user WHERE username = #{username}")
    boolean existsByUsername(String username);

    @Select("SELECT * FROM user WHERE username = #{username}")
    User selectByUsername(String username);
}