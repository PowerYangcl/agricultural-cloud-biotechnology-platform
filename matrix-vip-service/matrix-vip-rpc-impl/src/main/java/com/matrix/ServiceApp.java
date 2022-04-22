package com.matrix;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;

public class ServiceApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath*:applicationContext.xml",  
                });
        context.start();
        
        System.out.println("dict-info-service 启动成功...");
        System.in.read();  
    }
}
















