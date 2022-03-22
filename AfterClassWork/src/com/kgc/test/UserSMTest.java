package com.kgc.test;

import com.kgc.pojo.User;
import com.kgc.service.BillService;
import com.kgc.service.UserService;
import com.kgc.util.MyBatisUtil;
import com.kgc.util.SpringUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserSMTest {
    UserService userService = SpringUtil.context.getBean("UserService", UserService.class);
    /**
     * 修改用户
     */
    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(6);
        user.setUserName("骨灰盒就");
        String info = userService.updateUser(user);
        System.out.println(info);
    }

    /**
     * 删除用户
     */
    @Test
    public void testDeleteUser(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setId(2);
        users.add(user);
        String info = userService.deleteUser(users);
        System.out.println(info);
    }
}
