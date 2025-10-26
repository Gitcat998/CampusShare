package com.campus.CampusShare.mapper;

import com.campus.CampusShare.entity.Review;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ReviewMapper {
    @Insert("INSERT INTO review (content, rating, user_id, item_id) " +
            "VALUES (#{content}, #{rating}, #{userId}, #{itemId})")
    int insert(Review review);

    @Select("SELECT * FROM review")
    List<Review> selectList();
}