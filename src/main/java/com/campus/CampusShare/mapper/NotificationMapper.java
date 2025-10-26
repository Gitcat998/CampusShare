package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Notification;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface NotificationMapper {
    int insert(Notification notification);
    List<Notification> selectList();
}