package com.neil.spboot.demo;

import com.neil.spboot.controller.HelloWorldController;
import com.neil.spboot.controller.NeilController;
import com.neil.spboot.domain.User;
import com.neil.spboot.mybatis.mapper.NeilMapper;
import com.neil.spboot.repository.UserRepository;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.util.Date;

/**
 * @author nibaoshan
 * @create 2017-11-29 14:11
 * @desc
 **/
@Log4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControlerTests {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NeilMapper neilMapper;

    private MockMvc mvc;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController(),new NeilController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

        mvc.perform(MockMvcRequestBuilders.get("/neil").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public  void  UserRepositoryTests(){
            Date date = new Date();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
            String formattedDate = dateFormat.format(date);

        User user2= User.builder()
                .nickName("帅")
                .regTime(new Date())
                .account("neilaccount")
                .fullname("XXX")
                .userName("aa1")
                .email("aa@126.com")
                .password("aa123456")
                .build();
        User j= userRepository.save(user2);
        log.info("userRepository.save: "+j);
    }

    @Test
    public void Test_modifyByIdAndUserId(){
        int i=userRepository.modifyByIdAndUserId("11232",2L);
        log.info("userRepository.modifyByIdAndUserId: "+i);
    }

    @Test
    public void Test_delete(){
        int i=userRepository.deleteByUserId(2L);
        log.info("userRepository.deleteByUserId: "+i);
    }
}
