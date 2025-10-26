package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ItemTypeDTO;
import com.campus.CampusShare.entity.ItemType;
import com.campus.CampusShare.mapper.ItemTypeMapper;
import com.campus.CampusShare.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemTypeServiceImpl implements ItemTypeService {

    @Autowired
    private ItemTypeMapper itemTypeMapper;

    @Override
    public Result add(ItemTypeDTO dto) {
        ItemType itemType = new ItemType();
        itemType.setName(dto.getName());
        itemTypeMapper.insert(itemType);
        return Result.success("分类添加成功");
    }

    @Override
    public Result list() {
        return Result.success("查询成功", itemTypeMapper.selectList());
    }
}