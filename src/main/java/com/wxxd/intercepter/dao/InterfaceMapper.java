package com.wxxd.intercepter.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface InterfaceMapper {
    @Insert("INSERT INTO `intercepterinfo`(ip,time,intercepterName) VALUES(#{ip},#{time},#{intercepterName})")
    int insertInterfaceInfo(@Param("ip") String ip, @Param("time") String time, @Param("intercepterName") String intercepterName);
}
