package com.campus.CampusShare.dto.request;

import lombok.Data;

@Data
public class ItemPublishDTO {
    private String name;
    private Long itemTypeId;
    private String description;
    private Long userId;
    private Integer borrowDuration;
}