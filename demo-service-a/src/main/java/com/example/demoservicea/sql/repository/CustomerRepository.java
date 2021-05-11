package com.example.demoservicea.sql.repository;

import com.example.demoservicea.sql.model.PilotUserAccess;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends PagingAndSortingRepository<PilotUserAccess, Long>
{

    @Query("select p from PilotUserAccess p where customerId = ?1")
    PilotUserAccess queryByCustomerId(String customerId);

}
