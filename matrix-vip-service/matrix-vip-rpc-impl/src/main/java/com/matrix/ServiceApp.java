package com.matrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.matrix.base.BaseLog;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ServiceApp {

    public static void main(String[] args) throws IOException {
        try {
        	BaseLog.getInstance().setLogger(null).sysoutInfo("matrix-vip-rpc 开始启动" , ServiceApp.class);
        	
        	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceApp.class);
        	context.start();
        	
        	BaseLog.getInstance().setLogger(null).sysoutInfo("matrix-vip-rpc 启动完成" , ServiceApp.class);
			new CountDownLatch(1).await();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
        
        
    }
}
















