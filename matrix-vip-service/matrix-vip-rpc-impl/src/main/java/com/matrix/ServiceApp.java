package com.matrix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.matrix.system.init.SystemInit;

import java.io.IOException;

public class ServiceApp {

    public static void main(String[] args) throws IOException {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
        		"classpath:META-INF/spring/spring-mongo.xml",
                "classpath:META-INF/spring/applicationContext.xml", 
                "classpath:META-INF/spring/spring-dubbo.xml",
                "classpath:META-INF/spring/spring-mybatis.xml", 
                "classpath:META-INF/spring/spring-cache.xml", 
                "classpath:META-INF/spring/spring-data-redis.xml"});*/
        
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath*:applicationContext.xml",  
                });
        context.start();
        
        System.out.println("dict-info-service 启动成功...");
        System.in.read();  
    }
}
















