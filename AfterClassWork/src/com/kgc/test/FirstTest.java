package com.kgc.test;

import com.kgc.pojo.Comment;
import com.kgc.pojo.Printer;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FirstTest {
    public final Logger logger = Logger.getLogger(getClass());
    @Test
    public void testFirst(){
        logger.info("||S");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("FirstBean.xml");
        Comment comment1 = context.getBean("comment1", Comment.class);
        comment1.showInfo();
        Comment comment2 = context.getBean("comment2", Comment.class);
        comment2.showInfo();

        Printer printer = context.getBean("printer", Printer.class);
        printer.showInfo();

        logger.info("||S-E||");
    }
}
