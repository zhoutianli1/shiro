package com.zhou;


import com.zhou.service.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class ShiroApplicationTests {

    @Autowired
    AccountServiceImpl accountService;


    @Test
    void contextLoads() {
        System.out.println("这个用户是："+accountService.queryAccByName("admin"));

    }





}
