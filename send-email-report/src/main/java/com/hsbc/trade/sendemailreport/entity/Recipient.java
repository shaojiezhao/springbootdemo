package com.hsbc.trade.sendemailreport.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(RecipientPK.class)
public class Recipient
{
    @Id
    private String recipientEmailAddress;

    @Id
    private String recipientName;

    public String getRecipientEmailAddress()
    {
        return recipientEmailAddress;
    }

    public void setRecipientEmailAddress(String recipientEmailAddress)
    {
        this.recipientEmailAddress = recipientEmailAddress;
    }

    public String getRecipientName()
    {
        return recipientName;
    }

    public void setRecipientName(String recipientName)
    {
        this.recipientName = recipientName;
    }
}
