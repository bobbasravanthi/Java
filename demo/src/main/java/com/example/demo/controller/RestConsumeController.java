package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Country;

@RestController
@RequestMapping("/restconsume")
public class RestConsumeController {
	@Autowired
	   private RestTemplateBuilder restTemplate;

	   @GetMapping("/")
	   public Country getRestCountryInfo() {
	       return restTemplate.build().getForObject("http://localhost:8080/country/info/{code}", Country.class, 1);
	   }
}
