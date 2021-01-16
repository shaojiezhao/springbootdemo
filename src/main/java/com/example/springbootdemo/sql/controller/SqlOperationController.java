package com.example.springbootdemo.sql.controller;

import com.example.springbootdemo.sql.model.PilotUserAccess;
import com.example.springbootdemo.sql.service.SqlOperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sql")
public class SqlOperationController
{
    @Resource
    private SqlOperationService sqlOperationService;

    @PostMapping("/saveCustomerInfo")
    public ResponseEntity<String> saveCustomerInfo(@RequestBody PilotUserAccess pilotUserAccess)
    {
        return sqlOperationService.saveCustomerInfo(pilotUserAccess);
    }

    @GetMapping("/queryByCustomerId")
    public ResponseEntity<PilotUserAccess> queryByCustomerId(@RequestParam("customerId") String customerId)
    {
        return sqlOperationService.queryByCustomerId(customerId);
    }

    @GetMapping("queryPilotUserInfoByMapper")
    public ResponseEntity<PilotUserAccess> queryPilotUserInfoByMapper(@RequestParam("customerId") String customerId)
    {
        return sqlOperationService.queryPilotUserInfoByMapper(customerId);
    }

    @GetMapping("/queryAllCustomerInfo")
    public List<PilotUserAccess> queryAllCustomerInfo()
    {
        return sqlOperationService.queryAllCustomerInfo();
    }
}
