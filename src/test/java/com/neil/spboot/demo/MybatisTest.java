package com.neil.spboot.demo;

import com.neil.spboot.mybatis.mapper.StudentMapper;
import com.neil.spboot.mybatis.mapper.UserMapper;
import com.neil.spboot.mybatis.model.Student;
import com.neil.spboot.mybatis.model.User;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nibaoshan
 * @create 2017-12-04 18:46
 * @desc
 **/
@Log4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

//    @Autowired
//     public studentMapper studentMapper;

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public StudentMapper studentMapper;

    @Test
    public  void Test_InserUserMapper(){
        User model= User.builder()
                .account("小明")
                .build();
       int i= userMapper.insert(model);
        log.info("-----------userMapper.insert: -----------"+i);
    }

    @Test
    public void  Test_studentMapper(){
        Student student=Student.builder()
                .id(1)
                .name("西游")
                .build();
        int i=studentMapper.insert(student);
        log.info("-----------studentMapper.insert: -----------"+i);
    }
}
