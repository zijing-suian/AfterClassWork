package com.kgc.dao;

import com.kgc.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public Integer addUser();

    /**
     * 通用查询
     * @param map
     * @return
     */
    public List<User> queryUsers(Map<String,Object> map);

    /**
     * 删除用户
     * @param user
     * @return
     */
    public Integer deleteUser(User user);

    /**
     * 修改用户[信息/密码]
     * @param user
     * @return
     */
    public Integer updateUser(User user);
}
