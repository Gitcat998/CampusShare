package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.BorrowApplyDTO;

/**
 * 借阅申请服务接口
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
public interface BorrowApplyService {
    Result apply(BorrowApplyDTO dto);
    Result approve(Long applyId);
    Result reject(Long applyId);
    Result returnItem(Long applyId);
}