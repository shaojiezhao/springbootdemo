package com.example.springbootdemo.sql.repository;

import com.example.springbootdemo.sql.model.PilotUserAccess;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends PagingAndSortingRepository<PilotUserAccess, Long>
{

    @Query("select p from PilotUserAccess p where customerId = ?1")
    PilotUserAccess queryByCustomerId(String customerId);

}
