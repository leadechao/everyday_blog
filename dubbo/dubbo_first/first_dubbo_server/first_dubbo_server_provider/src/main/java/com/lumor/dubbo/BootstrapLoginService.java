package com.lumor.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Auther: Administrator
 * @Date: 2019/11/20 0020 07:18
 * @Description:
 */
public class BootstrapLoginService {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-server.xml");

//        加载
        context.start();
//堵塞进程
        System.in.read();

    }
}
