package com.muchi.gulimallproduct.product.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * author: yuzq
 * create: 2020-06-08 15:51
 **/
public class MySqlSessionConfig {
    @Bean
    @ConfigurationProperties(prefix = "mybatis")
    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean() {
        return new MybatisSqlSessionFactoryBean();
       // sqlSessionFactoryBean.setDataSource(dataSource());
        //分页插件
      /*  PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        Interceptor[] plugins = {paginationInterceptor};
        sqlSessionFactoryBean.setPlugins(plugins);*/
       // return sqlSessionFactoryBean;
    }

}
