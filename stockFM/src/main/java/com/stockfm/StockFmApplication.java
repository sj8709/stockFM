package com.stockfm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class StockFmApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockFmApplication.class, args);
	}

}
