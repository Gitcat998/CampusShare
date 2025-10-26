package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    @Insert("INSERT INTO item (name, item_type_id, description, status, user_id, borrow_duration, create_time, update_time, is_delete) " +
            "VALUES (#{name}, #{itemTypeId}, #{description}, #{status}, #{userId}, #{borrowDuration}, #{createTime}, #{updateTime}, #{isDelete})")
    int insert(Item item);
}