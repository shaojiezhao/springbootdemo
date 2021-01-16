package com.example.springbootdemo.sql.mapper;

import com.example.springbootdemo.sql.model.PilotUserAccess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PilotUserAccessMapper
{
//    @Select("select * from PILOT_USER_ACCESS where customer_Id = #{customerId}")
    PilotUserAccess queryPilotUserInfoByMapper( String customerId);
}
