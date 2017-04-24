package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Controller {
	@RequestMapping(value = "/get")
	public ResBean get() {
		log.info("/get");
		
		return ResBean.builder()
				.message("success")
				.build();
	}
}

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class ResBean {
	String message;
}