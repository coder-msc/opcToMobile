package com.neuqmsc.mapper;

import com.neuqmsc.entity.PlcDevice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PlcDeviceMapper {
    int deleteByPrimaryKey(String deviceName);

    int insert(PlcDevice record);

    PlcDevice selectByPrimaryKey(@Param("deviceName") String deviceName);

    List<PlcDevice> selectAll();

    int updateByPrimaryKey(PlcDevice record);
    int checkTable(@Param("deviceName") String deviceName);
    int creatTableByDeviceName(@Param("deviceName") String deviceName);
    int saveDeviceVal(@Param("deviceValue") String deviceValue,@Param("deviceName") String deviceName);
}