package com.campus.CampusShare.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

@Data
@TableName("item")
public class Item {
    private Long id;
    private String name;
    private Long itemTypeId;
    private String description;
    private Integer status;
    private Long userId;
    private Integer borrowDuration;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;
}