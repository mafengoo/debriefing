package com.hanlm.debriefing.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;


@Configuration
@MapperScan(value={"com.hanlm.debriefing.modules.**.mapper*"})
public class MybatisPlusConfig {

    /**
     * 
    * @Description: 分页插件
    *
    * @Title: paginationInterceptor 
    * @return    
    * PaginationInterceptor 
    * @throws
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    
    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
//    @Bean
//    public PerformanceInterceptor performanceInterceptor() {
//    	PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        //格式化sql语句
//        Properties properties = new Properties();
//        properties.setProperty("format", "true");
//        performanceInterceptor.setProperties(properties);
//        return new PerformanceInterceptor();
//    }
   
}
