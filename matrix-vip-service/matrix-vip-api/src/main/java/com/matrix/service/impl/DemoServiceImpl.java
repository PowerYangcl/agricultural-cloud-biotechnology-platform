package com.matrix.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.apache.dubbo.config.annotation.Method;

import com.matrix.common.Constants;
import com.matrix.rpc.IRpcDemoService;
import com.matrix.service.IDemoService;

@Service
public class DemoServiceImpl implements IDemoService {
	
	
    @DubboReference(interfaceClass = IRpcDemoService.class,
            version = Constants.VERSION, timeout = 1000,
            methods = {
            						@Method(name = "findDemoMessageRpc", timeout = 3000, retries = 1),								// 当前用到哪个rpc 接口方法写哪个
            						@Method(name = "findDemoMessageRpcInConfig", timeout = 3000, retries = 1)
    							})
	private IRpcDemoService rpcDemoService;
	
    
    
	public String demo(String msg) {
		return rpcDemoService.findDemoMessageRpc(msg) + " && " + rpcDemoService.findDemoMessageRpcInConfig(msg);
	}
}



