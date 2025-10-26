package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.BorrowApplyDTO;

public interface BorrowApplyService {
    Result apply(BorrowApplyDTO dto);
    Result approve(Long applyId);
    Result reject(Long applyId);
    Result returnItem(Long applyId);
}