package com.neil.spboot.demo;

import com.neil.spboot.service.MailService;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Log4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService mailService;

    @Test
    public void testSimpleMail() {
        try{
            mailService.sendSimpleMail("test@blogneil.top","test@blogneil.top"," hello this is simple mail");
        }catch (Exception ex){
            log.error("发送失败 ex:{}",ex);
        }

    }
}
