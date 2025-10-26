package com.campus.CampusShare.entity;

/**
 * 通知实体
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
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