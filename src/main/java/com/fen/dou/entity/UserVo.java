package com.fen.dou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo implements Serializable {
    private Integer id;
    private String name;
    private Integer scholl_id;
}
