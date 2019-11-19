package com.lumor.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Bootstrap {

    public static void main(String[] args) throws IOException {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-server.xml");
        context.start();
        System.in.read();


//        com.alibaba.dubbo.container.Main.main(
//                new String[]{"spring","log4j"});
    }
}
