package com.fdx.rtct.staticModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.fdx.rtct.staticModule")
@RequestMapping
public class StaticApplication {
	
	public static void main(String[] args) {
		System.out.println("--allocation started-----");
		SpringApplication.run(StaticApplication.class, args);
	}
	
	@RequestMapping(path = "/method2" , method = RequestMethod.GET )
	public String method(){
		return "Scan Test Controller 2";
		
	}
	
	
}
