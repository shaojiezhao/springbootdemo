package com.hsbc.trade.sendemailreport.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Map;

@Component
public class EmailUtil
{
    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.from}")
    private String from;

    public void sendTemplateMail(String subject, String[] ccArr, String[] toArr, Map<String, Object> paramMap, String template) throws MessagingException
    {
        Context context = new Context();
        context.setVariables(paramMap);

        String emailContent = templateEngine.process(template, context);
        sendHtmlMail(subject, emailContent, ccArr, toArr);
    }

    private void sendHtmlMail(String subject, String emailContent, String[] ccArr, String[] toArr) throws MessagingException
    {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        messageHelper.setFrom(from);
        messageHelper.setCc(ccArr);
        messageHelper.setTo(toArr);
        messageHelper.setSubject(subject);
        messageHelper.setText(emailContent, true);

        mailSender.send(mimeMessage);
    }
}
