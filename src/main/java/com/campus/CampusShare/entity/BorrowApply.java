package com.campus.CampusShare.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

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