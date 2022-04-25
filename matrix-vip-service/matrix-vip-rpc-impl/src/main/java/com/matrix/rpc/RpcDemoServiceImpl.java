package com.matrix.rpc;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.matrix.common.Constants;
import com.matrix.service.IDemoService;

/**
 * @description: Rpc接口实现类，命名规则：Rpc + 业务描述 + ServiceImpl
 * 
 * @author Yangcl
 * @date 2022-4-24 16:20:04
 * @home https://github.com/PowerYangcl
 * @path matrix-vip-rpc-impl / com.matrix.rpc.RpcDemoServiceImpl.java
 * @version 1.6.1.0-platform-init
 */

@DubboService(version = Constants.VERSION)
public class RpcDemoServiceImpl implements IRpcDemoService {
	
	@Autowired
	private IDemoService demoService;

	/**
	 * @description: 简单的实例
	 * 
	 * @author Yangcl
	 * @date 2022-4-24 16:35:06
	 * @home https://github.com/PowerYangcl
	 * @version 1.6.1.0-platform-init
	 */
	public String findDemoMessageRpc(String msg) {
		return demoService.findDemoMessage(msg);
	}

	
	public String findDemoMessageRpcInConfig(String msg) {
		return demoService.findDemoMessageConfig(msg);
	}
	
	
}

















