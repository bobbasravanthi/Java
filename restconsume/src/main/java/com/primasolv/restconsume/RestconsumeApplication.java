package com.primasolv.restconsume;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.primasolv.beans.JsonStoreBean;

@SpringBootApplication
public class RestconsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestconsumeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			JsonStoreBean quote = restTemplate.getForObject(
					"https://gturnquist-quoters.cfapps.io/api/random", JsonStoreBean.class);
			System.out.println("Result here you go:");
			System.out.println(quote.toString());
		};
	}
}
