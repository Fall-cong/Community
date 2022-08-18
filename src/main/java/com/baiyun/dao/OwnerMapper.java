package com.baiyun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baiyun.model.Owner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("ownerDao")
public interface OwnerMapper extends BaseMapper<Owner> {

    //查询
    List<Owner> queryOwnerAll(Owner owner);

    /**
     * 通过username查询owner
     */
    Owner queryOwnerByName(@Param("username") String username);

    void deleteOwnerUserByUserName(@Param("username2") String username);

    Owner queryOwnerById(@Param("id") long parseLong);
}
