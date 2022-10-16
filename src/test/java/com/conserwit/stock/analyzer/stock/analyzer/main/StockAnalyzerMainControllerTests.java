package com.conserwit.stock.analyzer.stock.analyzer.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StockAnalyzerMainControllerTests {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAnalyze_200() {
		assertThat(this.restTemplate.getForObject(getUrlString(this.port),
				String.class)).contains("Completed analysis for stock test123");
	}

	private String getUrlString(int port) {
		return new StringBuilder("http://localhost:").append(port).append("/test123/analyze").toString();


	}

}
