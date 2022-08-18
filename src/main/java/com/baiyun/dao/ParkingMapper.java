package com.baiyun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baiyun.model.Parking;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("parkingDao")
public interface ParkingMapper extends BaseMapper<Parking> {

     //分页查询车位信息
     List<Parking> queryParkAll(@Param("numbers") String numbers);

     //查询使用的车位信息
     List<Parking> queryParkAllByStatus();


}
