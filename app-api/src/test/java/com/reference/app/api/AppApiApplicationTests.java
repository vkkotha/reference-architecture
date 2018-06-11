package com.reference.app.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.reference.app.application.AppConfiguration;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes= {AppConfiguration.class})
@ActiveProfiles("test")
public class AppApiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
