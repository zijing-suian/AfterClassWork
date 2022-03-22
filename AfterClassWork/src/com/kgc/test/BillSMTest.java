package com.kgc.test;

import com.kgc.dao.BillDao;
import com.kgc.pojo.Bill;
import com.kgc.service.BillService;
import com.kgc.util.MyBatisUtil;
import com.kgc.util.SpringUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BillSMTest {
    public Logger logger = Logger.getLogger(getClass());

    BillService billService = SpringUtil.context.getBean("BillService", BillService.class);
    /**
     * 对bill查询进行测试
     */
    @Test
    public void testQueryBill(){
        logger.info("||");

        List<Bill> bills = billService.queryBill(null);
        System.out.println(bills);
    }

    /**
     * 按商品名称[模糊]/供应商id/是否付款 [3]
     */
    @Test
    public void testQueryBillByBean(){
        Bill bill = new Bill();
        bill.setProductName("%大%");
        bill.setProviderId(1);
        bill.setIsPayment(1);
        List<Bill> bills = billService.queryBillByBean(bill);
        System.out.println(bills);
    }

    @Test
    public void testDeleteBill(){
        List<String> idStrs = new ArrayList<String>();
        idStrs.add("2");
//        idStrs.add("7");
        String info = billService.deleteBill(idStrs);
        System.out.println(info);
    }
}
