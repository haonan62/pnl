package com.xuliuxianglab.forex.portal.pnl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableFeignClients("com.xuliuxianglab.forex.portal.pnl")
@EnableDiscoveryClient
@EnableRetry
public class PnlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PnlApplication.class, args);
	}

}
