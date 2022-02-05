package com.cskt.common.config;

/**
 * @Author 刘涛
 * @Date: 2022/01/27/ 15:10
 * @Description MyBatisPlus配置类
 */

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.cskt.mapper"})
class MyBatisPlusConfig {
    /**
     * 配置分页插件，从3.4.0开始使用新的配置方式
     * @return
     */
    @Bean
    public MybatisPlusInterceptor plusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new
                MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new
                PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}

