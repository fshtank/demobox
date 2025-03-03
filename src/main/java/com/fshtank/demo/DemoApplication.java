package com.fshtank.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableConfigurationProperties
public class DemoApplication {

	@Autowired
	private LambdaExample lambdaExample;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		StreamIntermediateOperationsExample tempTest = new StreamIntermediateOperationsExample();
		tempTest.callMe(null);

		LambdaExample lambdaExample = new LambdaExample();
		lambdaExample.callMe();
	}

}
