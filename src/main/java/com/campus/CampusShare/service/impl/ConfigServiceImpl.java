package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ConfigDTO;
import com.campus.CampusShare.entity.Config;
import com.campus.CampusShare.mapper.ConfigMapper;
import com.campus.CampusShare.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ConfigMapper configMapper;

    @Override
    public Result update(ConfigDTO dto) {
        Config config = new Config();
        config.setKey(dto.getKey());
        config.setValue(dto.getValue());
        configMapper.updateById(config);
        return Result.success("配置更新成功");
    }

    @Override
    public Result get() {
        return Result.success("查询成功", configMapper.selectList(null));
    }
}