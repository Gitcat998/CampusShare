package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.ItemType;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ItemTypeMapper {
    int insert(ItemType itemType);
    List<ItemType> selectList();
}