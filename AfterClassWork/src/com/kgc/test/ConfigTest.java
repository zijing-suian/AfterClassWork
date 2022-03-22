package com.kgc.test;

import com.kgc.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ConfigTest {
    @Test
    public void springTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println("数据源配置:"+dataSource.toString());
    }
}
