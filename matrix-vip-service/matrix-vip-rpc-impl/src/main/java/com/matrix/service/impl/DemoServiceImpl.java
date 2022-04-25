package com.matrix.service.impl;

import org.springframework.stereotype.Service;

import com.matrix.base.BaseClass;
import com.matrix.service.IDemoService;

@Service
public class DemoServiceImpl extends BaseClass implements IDemoService {

	/**
	 * @description: 简单的实例
	 * 
	 * @author Yangcl
	 * @date 2022-4-24 16:35:06
	 * @home https://github.com/PowerYangcl
	 * @version 1.6.1.0-platform-init
	 */
	@Override
	public String findDemoMessage(String msg) {
		return this.getInfo(90100001);
	}

	@Override
	public String findDemoMessageConfig(String msg) {
		return this.getConfig("matrix-vip-rpc.rpc_name");
	}

}
