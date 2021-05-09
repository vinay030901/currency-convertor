package com.javatpoint.microservices.netflixeurekanamingserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class NetflixEurekaNamingServerApplicationTests {

	
	@Autowired
	MockMvc mockMvc;
	@MockBean
	private NetflixEurekaNamingServerApplication applicationService;
	@Test
	void contextLoads() {
		
	}

}
