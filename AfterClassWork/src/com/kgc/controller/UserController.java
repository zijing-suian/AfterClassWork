package com.kgc.controller;

import com.kgc.pojo.User;
import com.kgc.service.UserService;
import com.kgc.util.SpringUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController{

    Logger logger = Logger.getLogger(getClass());

    UserService userService = SpringUtil.context.getBean("UserService",UserService.class);

    @RequestMapping("/login")
    public String login(User user){
        logger.info("loginCheck start... user:"+user);
        Map<String,Object> map = new HashMap<String,Object>();
        List<Integer> ids = new ArrayList<Integer>();
        map.put("ids",ids);
        map.put("myUser",user);
        List<User> users = userService.queryUsers(map);
        if(users==null||users.size()==0){
            logger.info("loginCheck  user:"+user+" result:false end!");
            return "index";
        }
        boolean check = false;
        for (User myUser:users
             ) {
            if(myUser.getUserName().equals(user.getUserName())&&myUser.getUserPassword().equals(user.getUserPassword())){
                user = myUser;
                check = true;
                break;
            }
        }
        if(!check){
            logger.info("loginCheck  user:"+user+" result:false end!");
            return "index";
        }
        logger.info("loginCheck  trueUser:"+user+" result:true end!");
        return "success";
    }
}
