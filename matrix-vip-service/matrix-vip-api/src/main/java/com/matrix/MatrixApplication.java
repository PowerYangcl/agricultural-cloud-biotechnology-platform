package com.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.matrix.base.BaseLog;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
public class MatrixApplication {
	
    public static void main(String[] args) {
    	try {
    		BaseLog.getInstance().setLogger(null).sysoutInfo("matrix-vip-api 开始启动" , MatrixApplication.class);
    		SpringApplication.run(MatrixApplication.class, args);
    		BaseLog.getInstance().setLogger(null).sysoutInfo("matrix-vip-api 启动完成" , MatrixApplication.class);
		} catch (Exception e) {
			if(e.getClass().getName().contains("SilentExitException")) {  // spring-boot-devtools jsp页面自动刷新导致
	            System.out.println("Spring is restarting the main thread - See spring-boot-devtools");
	        }else {
	        	e.printStackTrace();
	        }
		}
    }

}

























