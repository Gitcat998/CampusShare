package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ItemPublishDTO;
import com.campus.CampusShare.entity.Item;
import com.campus.CampusShare.mapper.ItemMapper;
import com.campus.CampusShare.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Result publish(ItemPublishDTO dto) {
        Item item = new Item();
        item.setName(dto.getName());
        item.setItemTypeId(dto.getItemTypeId());
        item.setDescription(dto.getDescription());
        item.setStatus(0); // 默认状态为待审核
        item.setUserId(dto.getUserId());
        item.setBorrowDuration(dto.getBorrowDuration());
        itemMapper.insert(item);
        return Result.success("物品发布成功");
    }
}