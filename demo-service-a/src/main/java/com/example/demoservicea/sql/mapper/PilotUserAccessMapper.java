package com.example.demoservicea.sql.mapper;

//import com.example.springbootdemo.sql.model.PilotUserAccess;
import com.example.demoservicea.sql.model.PilotUserAccess;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PilotUserAccessMapper
{
//    @Select("select * from PILOT_USER_ACCESS where customer_Id = #{customerId}")
    PilotUserAccess queryPilotUserInfoByMapper(String customerId);
}
