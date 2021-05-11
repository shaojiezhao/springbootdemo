package com.example.demoservicea.sql.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PilotUserAccess
{
    private String userId;

    private String userTpid;

    @Id
    private String customerId;

    private String productName;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserTpid()
    {
        return userTpid;
    }

    public void setUserTpid(String userTpid)
    {
        this.userTpid = userTpid;
    }

    public String getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }
}
