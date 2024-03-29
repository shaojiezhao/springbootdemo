package com.hsbc.trade.sendemailreport.controller;

import com.hsbc.trade.sendemailreport.service.EmailReportService;
import com.hsbc.trade.sendemailreport.vo.EmailReportRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义的String类
 */
import com.hsbc.trade.sendemailreport.vo.String;


@RestController
@RequestMapping("/email")
public class SendEmailController
{
    @Autowired
    private EmailReportService emailReportService;

    @PostMapping("/sendEmail")
    public void sendEmail(@RequestBody EmailReportRequestVo reportRequestVo)
    {
        new String().prt();
        emailReportService.sendEmailReport(reportRequestVo);

    }
}
