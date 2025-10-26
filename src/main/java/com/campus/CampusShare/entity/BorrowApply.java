package com.campus.CampusShare.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * 借阅申请实体
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@Data
@TableName("borrow_apply")
public class BorrowApply {
    private Long id;
    private Long itemId;
    private Long userId;
    private Date applyTime;
    private Date expectedBorrowTime;
    private Date expectedReturnTime;
    private Integer status;
    private String rejectReason;
    private Date createTime;
    private Date updateTime;
}