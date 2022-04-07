package com.fen.dou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseUserVo implements Serializable {
    private Integer id;
    private String course;
    private Integer scholl_id;
    private Integer user_id;
}
