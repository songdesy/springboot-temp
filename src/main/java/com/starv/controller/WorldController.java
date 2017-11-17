package com.starv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: WSS by pc --> starv
 * Date: 11/16/17
 * Time: 5:07 PM
 * Version: v1.0
 * Description:
 */
@RestController
public class WorldController {
    @RequestMapping("/w")
    public String index(){
        return "Hello World !";
    }
}
