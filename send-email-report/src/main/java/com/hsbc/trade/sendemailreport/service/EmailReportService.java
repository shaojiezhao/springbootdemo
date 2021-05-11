package com.hsbc.trade.sendemailreport.service;

import com.hsbc.trade.sendemailreport.vo.EmailReportRequestVo;

public interface EmailReportService
{
    void sendEmailReport(EmailReportRequestVo requestVo);
}
