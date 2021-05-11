package com.hsbc.trade.sendemailreport.vo;

public class EmailReportRequestVo
{
    private String recipientName;

    private String country;

    private String code;

    private String incident;

    public String getRecipientName()
    {
        return recipientName;
    }

    public void setRecipientName(String recipientName)
    {
        this.recipientName = recipientName;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getIncident()
    {
        return incident;
    }

    public void setIncident(String incident)
    {
        this.incident = incident;
    }
}
