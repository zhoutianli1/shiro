package com.zhou.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.pojo.Account;

//在对应的Mapper上继承基本的类baseMapper
public interface AccountMapper extends BaseMapper<Account> {
    //所有的CRUD已经编写完成
    //不需要像以前的配置一些xml
}