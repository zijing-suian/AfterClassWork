package com.kgc.service.impl;

import com.kgc.dao.BillDao;
import com.kgc.pojo.Bill;
import com.kgc.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Transactional
@Service("BillService")
public class BillServiceImpl implements BillService {
    @Autowired
    BillDao billDao;

    @Override
    public List<Bill> queryBill(String providerIdStr) {
        Integer providerId = null;
        if(providerIdStr!=null&&!"".equals(providerIdStr)){
            providerId = Integer.parseInt(providerIdStr);
        }
        return billDao.queryBill(providerId);
    }

    @Override
    public List<Bill> queryBillPage(Map<String, Object> map) {
        return null;
    }

    @Override
    public List<Bill> queryBillByBean(Bill bill) {
        return billDao.queryBillByBean(bill);
    }

    @Override
    public List<Bill> queryBillAndProvider(Bill bill) {
        return null;
    }

    @Override
    public List<Bill> queryBillAndProviderMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public String deleteBill(List<String> idStrs) throws RuntimeException{
        int count = 0;
        Integer id = null;
        String info = "删除失败";
        for (String idStr:idStrs
             ) {
            if (idStr!=null&&!"".equals(idStr)){
                id = Integer.parseInt(idStr);
                billDao.deleteBill(id);
                count++;
//                throw new RuntimeException();
            }
        }
        if(count>0){
            info = "删除成功";
        }
        return info;
    }
}
