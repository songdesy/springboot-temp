package com.starv.controller;

import com.starv.app.MyBeanYamlConfig;
import com.starv.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: WSS by pc --> starv
 * Date: 11/21/17
 * Time: 11:19 AM
 * Version: v1.0
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    MyBeanYamlConfig myBeanYamlConfig;

    @RequestMapping("/user")
    public String userInfo() {
        List<User> list = myBeanYamlConfig.getList();
        list.forEach(user -> System.out.println(user));
        if (list != null && list.size() > 0)
            return list.get(0).toString();
        return null;
    }
}
