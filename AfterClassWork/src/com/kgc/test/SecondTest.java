package com.kgc.test;

import com.kgc.config.SpringConfig;
import com.kgc.pojo.Comment;
import com.kgc.service.UserService;
import com.kgc.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SecondTest {
    private final Logger logger = Logger.getLogger(getClass());
    /**
     * 对使用构造注入的测试[1]
     */
    @Test
    public void testCont(){
        logger.debug("--------------testCont start----------------------");
        //注意:先将组件扫描关闭
        //获取bean对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("FirstBean.xml");
        Comment comment3 = context.getBean("comment3", Comment.class);
        comment3.showInfo();
        Comment comment4 = context.getBean("comment4", Comment.class);
        comment4.showInfo();
        logger.debug("--------------testCont end----------------------");
    }
    /**
     * 对使用p命名空间注入的测试[2,3]
     */
    @Test
    public void testPs(){
        logger.debug("--------------testPs start----------------------");
        //注意:先将组件扫描关闭
        //获取bean对象
        //2
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("FirstBean.xml");
        Comment comment3 = context.getBean("comment5", Comment.class);
        Comment comment4 = context.getBean("comment6", Comment.class);
        comment3.showInfo();
        comment4.showInfo();

        //3
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.addUser());
        logger.debug("--------------testPs end----------------------");
    }

    /**
     * 通过注解实现ioc[4,5,6]
     */
    @Test
    public void testExpIoc(){
        logger.debug("--------------testExpIoc start----------------------");
        //注意,先确保配置类中开启了组件扫描与切面注解
        //加载配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取bean对象
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        System.out.println(userService.addUser());
        logger.debug("--------------testExpIoc end----------------------");
    }


}
