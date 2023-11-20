package com.rewe.digital.christmascoupons;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class ChristmasCouponsApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void exampleTest() {
		webTestClient.get().uri("/api/dummy").exchange().expectStatus().isNotFound();
	}
}

