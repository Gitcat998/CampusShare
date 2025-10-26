package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    int insert(Item item);
}