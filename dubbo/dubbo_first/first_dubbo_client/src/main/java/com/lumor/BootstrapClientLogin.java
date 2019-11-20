package com.lumor;

import com.lumor.dubbo.ILoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Administrator
 * @Date: 2019/11/20 0020 07:03
 * @Description:
 */
public class BootstrapClientLogin {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");

        context.start();

        ILoginService loginService = (ILoginService) context.getBean("loginService");

        System.out.println(loginService.login("张三"));

    }
}
