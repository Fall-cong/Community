package com.baiyun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baiyun.model.Userinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("userinfoDao")
public interface UserinfoMapper extends BaseMapper<Userinfo> {

    List<Userinfo> queryUserinfoAll(Userinfo userinfo);

    Userinfo queryUserByNameAndPwd(Userinfo userinfo);

    void deleteUserByUsername(@Param("username2") String username);
}
