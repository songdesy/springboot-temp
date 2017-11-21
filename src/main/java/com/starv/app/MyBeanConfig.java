package com.starv.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: WSS by pc --> starv
 * Date: 11/20/17
 * Time: 3:13 PM
 * Version: v1.0
 * Description:
 */
@Component
public class MyBeanConfig {

    @Value("${name}")
    private String name;

    public void printName() {
        System.out.println("What's your name?");
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
