package com.zhou.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhou.Mapper.AccountMapper;
import com.zhou.Service.AccountService;
import com.zhou.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * mybatis-plus的crud:
 * 这些方法都写在UserServiceImpl.java中
 */
@Service
public class AccountServiceImpl implements AccountService
{
    @Autowired
    private AccountMapper accountMapper;

    //查询全部
    public List<Account> queryAll() {
        return accountMapper.selectList(null);
    }

    @Override//重写AccountService的....
    public Account findByUsername(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        return accountMapper.selectOne(wrapper);
    }
}