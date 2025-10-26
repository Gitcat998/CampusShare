package com.campus.CampusShare.service.impl;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ReviewDTO;
import com.campus.CampusShare.entity.Review;
import com.campus.CampusShare.mapper.ReviewMapper;
import com.campus.CampusShare.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public Result add(ReviewDTO dto) {
        Review review = new Review();
        review.setContent(dto.getContent());
        review.setRating(dto.getRating());
        review.setUserId(dto.getUserId());
        review.setItemId(dto.getItemId());
        reviewMapper.insert(review);
        return Result.success("评价添加成功");
    }

    @Override
    public Result list() {
        return Result.success("查询成功", reviewMapper.selectList());
    }
}