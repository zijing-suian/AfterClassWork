package com.kgc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil {
    public static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }
}
