package com.example.demoservicea.sql.service;

import com.example.demoservicea.sql.model.PilotUserAccess;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SqlOperationService
{
    ResponseEntity<String> saveCustomerInfo(PilotUserAccess pilotUserAccess);

    ResponseEntity<PilotUserAccess> queryByCustomerId(String customerId);

    ResponseEntity<PilotUserAccess> queryPilotUserInfoByMapper(String customerId);

    List<PilotUserAccess> queryAllCustomerInfo();
}
