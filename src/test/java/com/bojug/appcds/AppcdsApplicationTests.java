package com.bojug.appcds;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppcdsApplicationTests {

	static {
		System.setProperty("DB_HOST", "localhost");
	}

	@Test
	void contextLoads() {
	}

}
