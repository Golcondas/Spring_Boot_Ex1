package com.neil.spboot.demo;

import com.neil.spboot.mybatis.mapper.NeilMapper;
import com.neil.spboot.mybatis.mapper.studentMapper;
import com.neil.spboot.mybatis.model.Neil;
import com.neil.spboot.mybatis.model.student;
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

    @Autowired
     public studentMapper studentMapper;
//    MybatisTest(NeilMapper neilMapper){
//        neilMapper=this.neilMapper;
//    }

    @Test
    public void Test_InsertMapper(){

        student model=student.builder()
                .id(1122)
                .name("neil专有")
                .build();
        int i= studentMapper.insert(model);
        log.info("userRepository.deleteByUserId: "+i);
    }
}
