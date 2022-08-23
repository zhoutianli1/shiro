package com.zhou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.zhou.mapper")
/**
 * @Mapper注解：
 * 作用：在接口类上添加了@Mapper，在编译之后会生成相应的接口实现类。
 * 添加位置：接口类上面
 *
 * @MapperScan注解：
 * 作用：指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
 * 添加位置：是在SpringBoot启动类上面添加
 * 添加@MapperScan(“com.example.dao”)注解以后，com.example.dao包下面的接口类，在编译之后都会生成相应的实现类
 *
 * 使用@MapperScan注解多个包
 * @MapperScan({“com.example.dao”,“com.example.mapper”})
 */
@MapperScan("com.zhou.Mapper")
public class ShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
    }

}
