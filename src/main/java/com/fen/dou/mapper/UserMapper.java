package com.fen.dou.mapper;

import com.fen.dou.entity.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from USER")
    public List<UserVo> queryUser();

    @Select("SELECT COUNT(*) FROM (SELECT * FROM USER o) pro")
    public Integer queryCount();
}
