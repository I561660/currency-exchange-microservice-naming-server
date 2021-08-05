package com.anthony.namingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CurrencyExchangeMicroservicesNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeMicroservicesNamingServerApplication.class, args);
	}

}
