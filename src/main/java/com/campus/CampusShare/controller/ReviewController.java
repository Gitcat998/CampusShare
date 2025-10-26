package com.campus.CampusShare.controller;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ReviewDTO;
import com.campus.CampusShare.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/add")
    public Result add(@RequestBody ReviewDTO dto) {
        return reviewService.add(dto);
    }

    @GetMapping("/list")
    public Result list() {
        return reviewService.list();
    }
}