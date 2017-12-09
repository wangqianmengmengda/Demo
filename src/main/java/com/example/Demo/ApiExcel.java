package com.example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * Created by hz on 12/8/17.
 */
@SpringBootApplication
public class ApiExcel implements EmbeddedServletContainerCustomizer {
	public static void main(String[] args) {
		SpringApplication.run(ApiExcel.class,args);
	}
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8080);
	}
}