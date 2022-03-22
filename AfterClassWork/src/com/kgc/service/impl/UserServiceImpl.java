package com.kgc.service.impl;

import com.kgc.dao.UserDao;
import com.kgc.pojo.User;
import com.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Transactional
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
//    @Resource
    UserDao dao;

//    public UserDao getDao() {
//        return dao;
//    }
//
//    public void setDao(UserDao dao) {
//        this.dao = dao;
//    }

    @Override
    public String addUser() {
        System.out.println("C:UserServiceImpl M:addUser ");
        System.out.println(dao.addUser());
        return "添加";
    }

    @Override
    public List<User> queryUsers(Map<String, Object> map) {
        return dao.queryUsers(map);
    }

    @Override
    public String deleteUser(List<User> users) {
        String info = "删除失败";
        Integer count = 0;
        for (User user:users
             ) {
            dao.deleteUser(user);
            count++;
        }
        if(count>0){
            info = "删除成功";
        }
        throw new RuntimeException();
//        return info;
    }

    @Override
    public String updateUser(User user) {
        String info = "修改失败";
        if (dao.updateUser(user)>0){
            info = "修改成功";
        }
        throw new RuntimeException();
//        return info;
    }
}
