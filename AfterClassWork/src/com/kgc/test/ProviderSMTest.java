package com.kgc.test;

import com.kgc.pojo.Provider;
import com.kgc.service.ProviderService;
import com.kgc.util.SpringUtil;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ProviderSMTest {
    public Logger logger = Logger.getLogger(getClass());
    ProviderService providerService = SpringUtil.context.getBean("ProviderService", ProviderService.class);
    /**
     * 查询符合条件的供应商--测试--[1&&2&&4-1.2]
     */
    @Test
    public void testQueryProviders(){
        logger.info("start...");
        Provider provider = new Provider();
//        provider.setId(1);
        provider.setProName("%火%");
//        provider.setProCode("%JS%");
        List<Provider> providers = providerService.queryProviders(provider);
        System.out.println(providers);
        logger.info("数量:"+providers.size());
    }

    /**
     * 删除供应商[3&&4.3]
     */
    @Test
    public void testDeleteProvider(){
        Provider provider = new Provider();
        provider.setId(19);
        Integer integer = null;
        try {
            integer = providerService.deleteProvider(provider);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(integer);
    }

    /**
     * 添加供应商[5]
     */
    @Test
    @Transactional(rollbackFor = RuntimeException.class)
    public void testAddProvider(){
        Provider provider = new Provider();
        provider.setProName("gvhjjk");
        provider.setProCode("123456");
        provider.setProContact("12345546345346");
        Integer integer = null;
//        try {
        try {
            integer = providerService.addProvider(provider);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(integer);
    }

    /**
     *
     */
    @Test
    public void testUpdateProvider(){
        Provider provider = new Provider();
        provider.setId(19);
        provider.setProName("广泛议题一偶");
        Integer integer = null;
        try {
            integer = providerService.updateProvider(provider);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(integer);
    }
}
