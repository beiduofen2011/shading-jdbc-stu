package com.fen.dou;


import com.fen.dou.mapper.CourseUserMapper;
import com.fen.dou.mapper.UserMapper;
import com.fen.dou.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class TestJunit {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CourseUserMapper courseUserMapper;

    @Test
    public void testSay() throws Exception {
        System.out.println(userMapper.queryUser());
    }

    @Test
    public void testSay1() throws Exception {
        System.out.println(userMapper.queryCount());
    }
}