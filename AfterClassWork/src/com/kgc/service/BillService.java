package com.kgc.service;

import com.kgc.pojo.Bill;

import java.util.List;
import java.util.Map;

public interface BillService {
    /**
     * 按id就进行查询
     * @param providerIdStr
     * @return
     */
    public List<Bill> queryBill(String providerIdStr);

    /**
     * 分页
     * @param map
     * @return
     */
    public List<Bill> queryBillPage(Map<String,Object> map);

    /**
     * 查询
     * @param bill
     * @return
     */
    public List<Bill> queryBillByBean(Bill bill);

    /**
     * 查询账单以及供应商
     * @param bill
     * @return
     */
    public List<Bill> queryBillAndProvider(Bill bill);

    /**
     * 根据供应商 编码,名称,联系人,创建时间
     * @param map
     * @return
     */
    public List<Bill> queryBillAndProviderMap(Map<String,Object> map);

    /**
     * 按id删除订单
     * @param idStrs
     * @return
     */
    public String deleteBill(List<String> idStrs);

}
