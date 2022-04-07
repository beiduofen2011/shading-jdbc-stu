package com.fen.dou.mapper;

import com.fen.dou.entity.CourseUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface CourseUserMapper {
    @Select("select * from course_user")
    public CourseUserVo  queryCourseUser();
}
