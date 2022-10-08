package com.zhou.service;

import com.zhou.mapper.AccountMapper;
import com.zhou.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountMapper accountMapper;
    @Override
    public Account queryAccByName(String username)
    {
        return accountMapper.queryAccByName(username);
    }
}
