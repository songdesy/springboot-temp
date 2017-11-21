package com.starv.app;

import com.starv.pojo.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: WSS by pc --> starv
 * Date: 11/20/17
 * Time: 4:08 PM
 * Version: v1.0
 * Description:
 */
@Component
@ConfigurationProperties(prefix = "users")
public class MyBeanYamlConfig {

    private final List<User> user = new ArrayList<>();

    public List<User> getList() {
        return this.user;
    }
}
