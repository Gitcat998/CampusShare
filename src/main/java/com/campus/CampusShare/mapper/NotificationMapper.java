package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Notification;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface NotificationMapper {
    @Insert("INSERT INTO notification (title, content, receiver_id) " +
            "VALUES (#{title}, #{content}, #{receiverId})")
    int insert(Notification notification);

    @Select("SELECT * FROM notification")
    List<Notification> selectList();
}