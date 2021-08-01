package com.hsbc.trade.sendemailreport.service.impl;

import com.hsbc.trade.sendemailreport.entity.Recipient;
import com.hsbc.trade.sendemailreport.repository.RecipientRepository;
import com.hsbc.trade.sendemailreport.service.EmailReportService;
import com.hsbc.trade.sendemailreport.utils.EmailUtil;
import com.hsbc.trade.sendemailreport.vo.EmailReportRequestVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmailReportServiceImpl implements EmailReportService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailReportServiceImpl.class);

    @Autowired
    private RecipientRepository recipientRepository;

    @Autowired
    private EmailUtil emailUtil;

    private static final String EMAIL_REPORT_TEMPLATE = "email_report";

    @Override
    public void sendEmailReport(EmailReportRequestVo requestVo)
    {
        //自定义了一个String类，所以此处爆红，但是不影响程序
        String recipientName = requestVo.getRecipientName();

        List<Recipient> recipientList = recipientRepository.findByRecipientName(recipientName);

        List<Recipient> toList = recipientList.stream().filter(item -> !"@@".equals(item.getRecipientName())).collect(Collectors.toList());

        List<Recipient> ccList = recipientList.stream().filter(item -> "@@".equals(item.getRecipientName())).collect(Collectors.toList());

        String[] toArr = toList.stream().map(item -> item.getRecipientEmailAddress()).collect(Collectors.toList()).toArray(new String[toList.size()]);

        String[] ccArr = ccList.stream().map(item -> item.getRecipientEmailAddress()).collect(Collectors.toList()).toArray(new String[ccList.size()]);

        String subject = "email subject";

        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("report", requestVo);

        try {
            emailUtil.sendTemplateMail(subject, ccArr, toArr, paramMap, EMAIL_REPORT_TEMPLATE);
        } catch (MessagingException e) {
            LOGGER.error("Email send error", e);
        }

    }
}
