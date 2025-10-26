package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.ItemType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ItemTypeMapper {
    @Insert("INSERT INTO item_type (name) VALUES (#{name})")
    int insert(ItemType itemType);

    @Select("SELECT * FROM item_type")
    List<ItemType> selectList();
}