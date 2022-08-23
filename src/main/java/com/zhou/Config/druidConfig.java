package com.zhou.Config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

public class druidConfig {
    /**
     * 1.虽然我们配置了druid连接池的其它属性，但是不会生效。因为默认是使用的java.sql.Datasource的类来获取属性的，
     * 有些属性datasource没有。如果我们想让配置生效，需要手动创建Druid的配置文件。
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }

    /**
     *Druid的最强大之处在于它有着强大的监控，可以监控我们发送到数据库的所有sql语句。方便我们后期排插错误
     * 配置监控服务器
     * @return 返回监控注册的servlet对象
     * @author SimpleWu
     */
}