package br.edu.infnet.appGeradorCss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppGeradorCssApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGeradorCssApplication.class, args);
	}

}
