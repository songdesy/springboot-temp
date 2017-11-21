package com.starv.controller;

import com.starv.app.MyBeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: WSS by pc --> starv
 * Date: 11/16/17
 * Time: 4:30 PM
 * Version: v1.0
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    private MyBeanConfig myBeanConfig;


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/name")
    public String showName() {
        myBeanConfig.printName();
        return myBeanConfig.getName();
    }
}
