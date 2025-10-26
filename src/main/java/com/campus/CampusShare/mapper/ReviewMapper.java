package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Review;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ReviewMapper {
    int insert(Review review);
    List<Review> selectList();
}