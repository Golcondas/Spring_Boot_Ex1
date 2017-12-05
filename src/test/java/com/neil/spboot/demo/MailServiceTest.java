package com.neil.spboot.demo;

import com.neil.spboot.service.MailService;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Log4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testSimpleMail() {
        try{
            mailService.sendSimpleMail("test@blogneil.top","test@blogneil.top"," hello this is simple mail");
        }catch (Exception ex){
            log.error("发送失败 ex:{}",ex);
        }

    }

    @Test
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent = templateEngine.process("emailTemplate", context);

        mailService.sendHtmlMail("test@blogneil.top","主题：这是模板邮件",emailContent);
    }
}
