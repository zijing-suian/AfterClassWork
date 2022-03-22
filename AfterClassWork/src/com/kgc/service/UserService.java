package com.kgc.service;

import com.kgc.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public String addUser();

    /**
     * 通用查询
     * @param map
     * @return
     */
    public List<User> queryUsers(Map<String,Object> map);

    /**
     * 删除用户
     * @param users
     * @return
     */
    public String deleteUser(List<User> users);

    /**
     * 修改用户[信息/密码]
     * @param user
     * @return
     */
    public String updateUser(User user);
}
