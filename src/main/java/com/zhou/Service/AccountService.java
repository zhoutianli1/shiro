package com.zhou.Service;

import com.zhou.pojo.Account;

public interface AccountService {
    public Account findByUsername(String username);
}