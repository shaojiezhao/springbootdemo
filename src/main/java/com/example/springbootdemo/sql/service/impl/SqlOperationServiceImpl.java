package com.example.springbootdemo.sql.service.impl;

import com.example.springbootdemo.sql.mapper.PilotUserAccessMapper;
import com.example.springbootdemo.sql.model.PilotUserAccess;
import com.example.springbootdemo.sql.repository.CustomerRepository;
import com.example.springbootdemo.sql.service.SqlOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.*;

@Service
public class SqlOperationServiceImpl implements SqlOperationService
{
    private static final ExecutorService threadPool = Executors.newCachedThreadPool();

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
        Future<String> future = getDataWithFuture();

        System.out.println("before get()");

        PilotUserAccess pilotUserAccess = pilotUserAccessMapper.queryPilotUserInfoByMapper(customerId);

        String getData = null;
        try {
            getData = future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println(getData);

        return ResponseEntity.ok(pilotUserAccess);
    }

    @Override
    public List<PilotUserAccess> queryAllCustomerInfo()
    {
        return (List)customerRepository.findAll();
    }


    private Future<String> getDataWithFuture()
    {
        Callable<String> callable = new Callable<String>()
        {
            @Override
            public String call() throws Exception
            {
                return getData();
            }
        };

        return threadPool.submit(callable);
    }

    private String getData()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "getData() method";
    }

}
