package com.campus.CampusShare.service;

import com.campus.CampusShare.common.Result;
import com.campus.CampusShare.dto.request.ReviewDTO;

public interface ReviewService {
    Result add(ReviewDTO dto);
    Result list();
}