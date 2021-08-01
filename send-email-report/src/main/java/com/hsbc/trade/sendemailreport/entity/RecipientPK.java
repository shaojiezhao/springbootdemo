package com.hsbc.trade.sendemailreport.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 复合主键类必须要实现序列化接口
 */
public class RecipientPK implements Serializable
{
    private String recipientEmailAddress;

    private String recipientName;

//    public String getRecipientEmailAddress()
//    {
//        return recipientEmailAddress;
//    }
//
//    public void setRecipientEmailAddress(String recipientEmailAddress)
//    {
//        this.recipientEmailAddress = recipientEmailAddress;
//    }
//
//    public String getRecipientName()
//    {
//        return recipientName;
//    }
//
//    public void setRecipientName(String recipientName)
//    {
//        this.recipientName = recipientName;
//    }

//    @Override
//    public boolean equals(Object o)
//    {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        RecipientPK that = (RecipientPK) o;
//        return recipientEmailAddress.equals(that.recipientEmailAddress) && recipientName.equals(that.recipientName);
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(recipientEmailAddress, recipientName);
//    }
}
