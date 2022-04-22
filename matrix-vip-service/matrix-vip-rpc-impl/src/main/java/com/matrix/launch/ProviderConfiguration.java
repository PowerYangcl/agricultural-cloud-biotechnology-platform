package com.matrix.launch;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;




/**
 * @description: 
 * 
 * @author Yangcl
 * @date 2022-4-22 17:46:03
 * @home https://github.com/PowerYangcl
 * @path matrix-vip-rpc-impl / com.matrix.launch.ProviderConfiguration.java
 * @version 1.6.1.0-platform-init
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.matrix.rpcimpl")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class ProviderConfiguration {

}
