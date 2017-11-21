package com.starv.app;

import org.springframework.core.Ordered;

/**
 * Created with IntelliJ IDEA.
 * User: WSS by pc --> starv
 * Date: 11/20/17
 * Time: 2:34 PM
 * Version: v1.0
 * Description:
 */
public class MyBeanOrder implements Ordered{
    @Override
    public int getOrder() {
        return 0;
    }
}
