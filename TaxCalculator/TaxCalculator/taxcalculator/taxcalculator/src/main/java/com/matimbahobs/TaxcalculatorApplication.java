package com.matimbahobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.matimbahobs" })
public class TaxcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxcalculatorApplication.class, args);
	}



}
