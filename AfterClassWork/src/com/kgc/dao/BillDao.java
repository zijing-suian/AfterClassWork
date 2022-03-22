package com.kgc.dao;

import com.kgc.pojo.Bill;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository(value = "BillDao")
public interface BillDao {
    /**
     * 按id就进行查询
     * @param providerId
     * @return
     */
    public List<Bill> queryBill(Integer providerId);

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
     * 根据id删除
     * @param id
     * @return
     */
    public Integer deleteBill(Integer id);
}
