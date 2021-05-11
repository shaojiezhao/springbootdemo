package com.hsbc.trade.sendemailreport.repository;

import com.hsbc.trade.sendemailreport.entity.Recipient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RecipientRepository extends Repository<Recipient, Long>
{
    @Query("select r from Recipient r where r.recipientName = ?1 or r.recipientName = '@@'")
    List<Recipient> findByRecipientName(String recipientName);
}
