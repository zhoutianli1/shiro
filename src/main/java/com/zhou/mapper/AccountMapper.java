package com.zhou.mapper;

import com.zhou.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AccountMapper  {
    public Account queryAccByName(String username);



}