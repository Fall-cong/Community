package com.baiyun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baiyun.model.Carcharge;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("carchargeDao")
public interface CarchargeMapper extends BaseMapper<Carcharge> {

    List<Carcharge> queryCarChargeAll(Carcharge carcharge);

}
