package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.BorrowApplyDTO;
import com.campus.CampusShare.entity.BorrowApply;
import com.campus.CampusShare.mapper.BorrowApplyMapper;
import com.campus.CampusShare.service.BorrowApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowApplyServiceImpl implements BorrowApplyService {

    @Autowired
    private BorrowApplyMapper borrowApplyMapper;

    @Override
    public Result apply(BorrowApplyDTO dto) {
        BorrowApply borrowApply = new BorrowApply();
        borrowApply.setItemId(dto.getItemId());
        borrowApply.setUserId(dto.getUserId());
        borrowApply.setStatus(0); // 默认状态为待审核
        borrowApplyMapper.insert(borrowApply);
        return Result.success("借用申请提交成功");
    }

    @Override
    public Result approve(Long applyId) {
        BorrowApply borrowApply = borrowApplyMapper.selectById(applyId);
        if (borrowApply == null) {
            return Result.error("申请记录不存在");
        }
        borrowApply.setStatus(1); // 审核通过
        borrowApplyMapper.updateById(borrowApply);
        return Result.success("审核通过");
    }

    @Override
    public Result reject(Long applyId) {
        BorrowApply borrowApply = borrowApplyMapper.selectById(applyId);
        if (borrowApply == null) {
            return Result.error("申请记录不存在");
        }
        borrowApply.setStatus(2); // 审核拒绝
        borrowApplyMapper.updateById(borrowApply);
        return Result.success("审核拒绝");
    }

    @Override
    public Result returnItem(Long applyId) {
        BorrowApply borrowApply = borrowApplyMapper.selectById(applyId);
        if (borrowApply == null) {
            return Result.error("申请记录不存在");
        }
        borrowApply.setStatus(3); // 已归还
        borrowApplyMapper.updateById(borrowApply);
        return Result.success("物品已归还");
    }
}