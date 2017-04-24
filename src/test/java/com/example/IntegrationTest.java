package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = ReqResLoggingTestApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class IntegrationTest {
	RestTemplate restTemplate = new RestTemplate();
	
	@Test
	public void test01() {
		restTemplate.getForObject(
				"http://localhost:8080/get",
				ResBean.class);
	}
}
