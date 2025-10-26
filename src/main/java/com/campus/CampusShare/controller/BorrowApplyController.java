package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.BorrowApplyDTO;
import com.campus.CampusShare.service.BorrowApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrow")
public class BorrowApplyController {

    @Autowired
    private BorrowApplyService borrowApplyService;

    @PostMapping("/apply")
    public Result apply(@RequestBody BorrowApplyDTO dto) {
        return borrowApplyService.apply(dto);
    }
}