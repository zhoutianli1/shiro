package com.zhou;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhou.Mapper.AccountMapper;
import com.zhou.pojo.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShiroApplicationTests {

    @Autowired
    private AccountMapper accountMapper;


    @Test
    void contextLoads() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username","user");
        Account account = accountMapper.selectOne(wrapper);
        System.out.println(account);
    }

    //测试 mybatis-plus是否整合成功
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        //参数是一个Wrapper，条件结构器，这里先不用 填null
        //查询所有的用户
        List<Account> accountList = accountMapper.selectList(null);
        accountList.forEach(System.out::println);
    }



}
