package com.kgc.dao;

import com.kgc.pojo.Provider;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository(value = "ProviderDao")
public interface ProviderDao {
    /**
     * 查询符合条件的供应商数量
     * @param provider
     * @return
     */
    public int queryProviderCount(Provider provider);

    /**
     * 查询符合条件的供应商
     * @param provider
     * @return
     */
    public List<Provider> queryProviders(Provider provider);

    /**
     * 根据供应商 编码,名称,联系人,创建时间 查询
     * @param map
     * @return
     */
    public List<Provider> queryProvidersMap(Map<String,Object> map);

    /**
     * 分页
     * @param map
     * @return
     */
    public List<Provider> queryProvidersPage(Map<String,Object> map);

    /**
     * 查询供应商及其订单列表
     * @param provider
     * @return
     */
    public List<Provider> queryProvidersAndBills(Provider provider);

    /**
     * 查询多个供应商及其订单列表
     * @param list
     * @return
     */
    public List<Provider> queryProvidersAndBillsList(List<Provider> list);

    /**
     * 根据订单编码(模糊),指定供应商id查询
     * @param map
     * @return
     */
    public List<Provider> queryProvidersAndBillsMap(Map<String,Object> map);

    /**
     * 查询供应商及其订单列表[分步]
     * @param provider
     * @return
     */
    public List<Provider> queryProvidersAndBillsStep(Provider provider);



    /**
     * 添加供应商
     * @param provider
     * @return
     */
    public Integer addProvider(Provider provider);

    /**
     * 修改供应商
     * @param provider
     * @return
     */
    public Integer updateProvider(Provider provider);

    /**
     * 删除供应商
     * @param provider
     * @return
     */
    public Integer deleteProvider(Provider provider);
}
