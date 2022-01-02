package com.melin.JavaWebMyBatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "HELLO MELIN!!!";
    }

    @RequestMapping("/hostname")
    public String hostname() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }
}
