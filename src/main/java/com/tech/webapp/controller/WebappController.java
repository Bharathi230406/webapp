package com.tech.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappController {
	@GetMapping(value = "/web")
	public String sayHi() {
		return "Hiiii";
	}
}
