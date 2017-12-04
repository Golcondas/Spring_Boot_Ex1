package com.neil.spboot.demo;

import com.neil.spboot.mybatis.mapper.neilDomainMapper;
import com.neil.spboot.mybatis.model.neilDomain;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan("com.neil.spboot.mybatis.mapper")
@SpringBootTest
public class MybatisTest {
    @Autowired
    public neilDomainMapper neilMapper;

    @Test
    public void Test_InsertMapper(){

        neilDomain model=neilDomain.builder()
                .idneil(1123)
                .neilname("neil专有")
                .build();
        int i= neilMapper.insert(model);
        log.info("userRepository.deleteByUserId: "+i);
    }
}
