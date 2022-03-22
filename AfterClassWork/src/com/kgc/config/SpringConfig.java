package com.kgc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ContextConfiguration  //将当前类作为配置类
@ComponentScan(basePackages = "com.kgc")  //开启组件扫描
@EnableAspectJAutoProxy  //开启切面注解
@EnableTransactionManagement  //开启事务注解
@PropertySource("dbConfig.properties")  //引入外部数据源配置文件
public class SpringConfig {
    @Bean(name = "DataSource")
    public DruidDataSource getDruidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("${mysql.url}");
        druidDataSource.setDriverClassName("${mysql.driver}");
        druidDataSource.setUsername("${mysql.username}");
        druidDataSource.setPassword("${mysql.password}");
        return druidDataSource;
    }

    @Bean(name = "DataSourceTransactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(DruidDataSource dataSource){
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }

    public SqlSessionFactoryBean getSqlSessionFactoryBean(DruidDataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

}
