package com.example.demoservicea.sql.service.impl;

//import com.example.springbootdemo.sql.mapper.PilotUserAccessMapper;
//import com.example.springbootdemo.sql.model.PilotUserAccess;
//import com.example.springbootdemo.sql.repository.CustomerRepository;
//import com.example.springbootdemo.sql.service.SqlOperationService;
import com.example.demoservicea.sql.mapper.PilotUserAccessMapper;
import com.example.demoservicea.sql.model.PilotUserAccess;
import com.example.demoservicea.sql.repository.CustomerRepository;
import com.example.demoservicea.sql.service.SqlOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SqlOperationServiceImpl implements SqlOperationService
{
    @Autowired
    private PilotUserAccessMapper pilotUserAccessMapper;

    private final CustomerRepository customerRepository;

    public SqlOperationServiceImpl(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    @Override
    public ResponseEntity<String> saveCustomerInfo(PilotUserAccess pilotUserAccess)
    {
        customerRepository.save(pilotUserAccess);
        return ResponseEntity.ok("200");
    }

    @Override
    public ResponseEntity<PilotUserAccess> queryByCustomerId(String customerId)
    {
        PilotUserAccess pilotUserAccess = customerRepository.queryByCustomerId(customerId);
        return ResponseEntity.ok(pilotUserAccess);
    }

    @Override
    public ResponseEntity<PilotUserAccess> queryPilotUserInfoByMapper(String customerId)
    {
        PilotUserAccess pilotUserAccess = pilotUserAccessMapper.queryPilotUserInfoByMapper(customerId);
        return ResponseEntity.ok(pilotUserAccess);
    }

    @Override
    public List<PilotUserAccess> queryAllCustomerInfo()
    {
        return (List)customerRepository.findAll();
    }

}
