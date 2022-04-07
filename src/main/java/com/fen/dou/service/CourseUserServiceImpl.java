package com.fen.dou.service;

import com.fen.dou.mapper.CourseUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseUserServiceImpl implements ICourseUserService {
    @Autowired
    private CourseUserMapper courseUserMapper;
}
