package com.kgc.test;

import com.kgc.dao.ProviderDao;
import com.kgc.pojo.Provider;
import com.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class ProviderDaoTest {
//    private static final Logger logger = Logger.getLogger(BillDaoTest.class);
    private final Logger logger = Logger.getLogger(this.getClass());

    /**
     * 查询测试
     */
    @Test
    public void queryTest(){
        logger.info("||S||");
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        try {
            ProviderDao mapper = sqlSession.getMapper(ProviderDao.class);
            logger.info("||S-P||");
            Provider provider = new Provider();
//        查询供应商数量
//        provider.setProName("%无良%");
//        System.out.println(mapper.queryProviderCount(provider));
//        logger.info("||S-P||");

//        2.查询供应商
//        provider.setProCode("%狼%");
//        logger.info("||S-P-EC:queryProviders||");
//        System.out.println(mapper.queryProviders(provider));
//        logger.info("||S-P-EC:queryProviders-E||");

            //查询供应商及其订单列表
//        provider.setId(2);
//        System.out.println(mapper.queryProvidersAndBills(provider));

            //查询供应商及其订单列表  分步
//        provider.setId(2);
//        List<Provider> providers =mapper.queryProvidersAndBillsStep(provider);
//
            //查询供应商及其订单列表  一步
//        List<Provider> providers = mapper.queryProvidersAndBills(provider);
//        System.out.println(providers);

//            查询多个供应商的订单列表[5]
//            List<Provider> list = new ArrayList<Provider>();
//            Provider provider1 = new Provider();
//            provider1.setId(1);
//            Provider provider2 = new Provider();
//            provider2.setId(2);
//            list.add(provider1);
//            list.add(provider2);
//            Map<String,Object> map = new HashMap<String,Object>();
////            map.put("code","%AILL%");
////            map.put("pros",list);
//            List<Provider> providers = mapper.queryProvidersAndBillsMap(map);
//            System.out.println("-------------------------------"+providers.size()+"-----------------------------");
//            for (Provider p:
//                 providers) {
//                System.out.println(p);
//            }

            //7  根据供应商 编码,名称,联系人,创建时间 查询
//            Map<String,Object> map1 = new HashMap<String,Object>();
////            map1.put("code",null);
////            map1.put("name","%乐%");
////            map1.put("name",null);
////        map1.put("catMan","%国%");
//            map1.put("catMan",null);
//        map1.put("time",BillDaoTest.format.format(new Date()));
////            map1.put("time",null);
//            List<Provider> providers1 = mapper.queryProvidersMap(map1);
//            System.out.println(providers1);


            //分页[8-1/2]
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("name",null);
            map.put("code",null);
            List<Integer> page = new ArrayList<Integer>();
            page.add(1);
            page.add(5);
            map.put("page",page);
            List<Provider> providers = mapper.queryProvidersPage(map);
            System.out.println(providers);
            logger.info("||S-P-EE:true||");
        } catch (Exception e) {
            logger.info("||S-P-EE:false||");
            e.printStackTrace();
        } finally {
            logger.info("||S-P-EE-EC:closeSqlSession||");
            MyBatisUtil.closeSqlSession(sqlSession);
            logger.info("||S-P-EE-EE:closeSqlSession-E||");
        }
    }

    @Test
    public void addTest(){
        logger.info("||S||");
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        try {
            ProviderDao mapper = sqlSession.getMapper(ProviderDao.class);
            Provider provider = new Provider();
            logger.info("||S-P||");
            provider.setProCode("3306");
            provider.setProName("狼子野心");
            provider.setProDesc("蛇鼠一窝");
            provider.setProCode("狼狈为奸");
            provider.setProPhone("1234567890");
            provider.setProAddress("北大青鸟");
            provider.setCreatedBy(1);
            provider.setCreationDate("2022-3-7");
            logger.info("||S-P-EC:addProvider||");
            System.out.println(mapper.addProvider(provider));
            logger.info("||S-P-EE:addProvider:true||");
        } catch (Exception e) {
            logger.info("||S-P-EE:addProvider:false||");
            e.printStackTrace();
        } finally {
            logger.info("||S-P-EE:addProvider-EC:closeSqlSession||");
            MyBatisUtil.closeSqlSession(sqlSession);
            logger.info("||S-P-EE:addProvider-EE:closeSqlSession-E||");
        }
    }
    @Test
    public void updateTest(){
        logger.info("||S||");
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        try {
            //3. 4.
            ProviderDao mapper = sqlSession.getMapper(ProviderDao.class);
            Provider provider = new Provider();
            logger.info("||S-P||");
            provider.setId(17);
            provider.setProName("无奸不商");
//            provider.setProDesc("蛇鼠一窝");
//            provider.setProCode("狼1狈为奸");
            provider.setProPhone("1234567890");
            provider.setProAddress("北大青鸟");
            provider.setProContact("托付给好");
            provider.setModifyBy(1);
            provider.setModifyDate("2022-3-7");
            logger.info("||S-P-EC:updateProvider||");
            System.out.println(mapper.updateProvider(provider));
            logger.info("||S-P-EE:updateProvider:true||");
        } catch (Exception e) {
            logger.info("||S-P-EE:updateProvider:false||");
            e.printStackTrace();
        } finally {
            logger.info("||S-P-EE:updateProvider-EC:closeSqlSession||");
            MyBatisUtil.closeSqlSession(sqlSession);
            logger.info("||S-P-EE:updateProvider-EE:closeSqlSession-E||");
        }
    }

    @Test
    public void deleteTest(){
        logger.info("||S||");
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        try {
            ProviderDao mapper = sqlSession.getMapper(ProviderDao.class);
            Provider provider = new Provider();
            logger.info("||S-P||");
            provider.setId(16);
            provider.setDelFlag(1);
            logger.info("||S-P-EC:deleteProvider||");
            System.out.println(mapper.deleteProvider(provider));
            logger.info("||S-P-EE:deleteProvider:true||");
        } catch (Exception e) {
            logger.info("||S-P-EE:deleteProvider:false||");
            e.printStackTrace();
        } finally {
            logger.info("||S-P-EE:deleteProvider-EC:closeSqlSession||");
            MyBatisUtil.closeSqlSession(sqlSession);
            logger.info("||S-P-EE:deleteProvider-EE:closeSqlSession-E||");
        }
    }
}
