package com.kgc.service.impl;

import com.kgc.dao.ProviderDao;
import com.kgc.pojo.Provider;
import com.kgc.service.ProviderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service("ProviderService")
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
@Transactional(rollbackFor = Exception.class)
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    ProviderDao providerDao;
    @Override
    public int queryProviderCount(Provider provider) {
        int count = providerDao.queryProviderCount(null);
        return count;
    }

    /**
     * 查询符合条件的供应商
     * @param provider
     * @return
     */
    @Override
    public List<Provider> queryProviders(Provider provider) {
        List<Provider> providers = providerDao.queryProviders(provider);
        return providers;
    }

    @Override
    public List<Provider> queryProvidersMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<Provider> queryProvidersPage(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<Provider> queryProvidersAndBills(Provider provider) {
        return null;
    }

    @Override
    public List<Provider> queryProvidersAndBillsList(List<Provider> list) {
        return null;
    }

    @Override
    public List<Provider> queryProvidersAndBillsMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<Provider> queryProvidersAndBillsStep(Provider provider) {
        return null;
    }

    @Override
    public Integer addProvider(Provider provider) throws Exception {
        providerDao.addProvider(provider);
//        int num=1/0;
//        providerDao.addProvider(provider);
//        throw new Exception();
        return 1;
    }

    @Override
    public Integer updateProvider (Provider provider) throws Exception{
        //        int num = 1/0;
        providerDao.updateProvider(provider);
//        throw new Exception();
        return 1;
    }

    @Override
    public Integer deleteProvider(Provider provider) throws Exception{
//        int num = 1/0;
        providerDao.deleteProvider(provider);
//        throw new Exception();
        return 1;
    }
}
