package com.campus.CampusShare.entity;

public class Notification {
    private String title;
    private String content;
    private Long receiverId;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }
}