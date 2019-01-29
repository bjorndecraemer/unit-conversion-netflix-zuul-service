package com.bjornspetprojects.microservices.unitconversionnetflixzuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class UnitConversionNetflixZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitConversionNetflixZuulServiceApplication.class, args);
	}

}

