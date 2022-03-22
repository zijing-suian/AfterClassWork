package com.kgc.test;

import com.kgc.dao.BillDao;
import com.kgc.pojo.Bill;
import com.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class BillDaoTest {
    private static final Logger logger = Logger.getLogger(BillDaoTest.class);
    public static SimpleDateFormat format = new SimpleDateFormat("yyyy");

    @Test
    public void queryTest(){
        logger.info("||S||");
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BillDao mapper = sqlSession.getMapper(BillDao.class);

        //分页[8-2/2]
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("myBill",null);
        List<Integer> page = new ArrayList<Integer>();
        page.add(1);
        page.add(5);
        map.put("page",page);
        List<Bill> bills1 = mapper.queryBillPage(map);
        System.out.println(bills1);

//        System.out.println(mapper.queryBill(1));

        Bill bill = new Bill();
//        bill.setProviderId(13);
//        bill.setIsPayment(2);
//        bill.setProductName("%洗%");
//
//        logger.info("||S-P||");
//        logger.info("||S-P-EC:queryBillByBean||");
//        System.out.println(mapper.queryBillByBean(bill));
//        logger.info("||S-P-EC:queryBillByBean-E||");

        //1.  模糊查询
//        bill.setId(2);
//        bill.setProductName("%豆%");
//        bill.setIsPayment(2);
//        bill.setProviderId(8);
//        logger.info("||S-P-EC:queryBillAndProvider||");
//        System.out.println(mapper.queryBillAndProvider(bill));
//        logger.info("||S-P-EC:queryBillAndProvider-E||");

        //6.  根据  供应商编码/供应商id
//        Map<String,Object> map1 = new HashMap<String,Object>();
//        map1.put("code","BILL2016_009");
//        List<Integer> pIds = new ArrayList<>();
//        pIds.add(1);
//        pIds.add(2);
////        map1.put("pIds",pIds);
//        List<Bill> bills = mapper.queryBillAndProviderMap(map1);
//        System.out.println(bills);

    }

}
