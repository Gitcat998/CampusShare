package com.campus.CampusShare.entity;

public class Review {
    private String content;
    private Integer rating;
    private Long userId;
    private Long itemId;

    public void setContent(String content) {
        this.content = content;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}