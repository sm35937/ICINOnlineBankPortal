package com.onlinebank.icin;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.onlinebank.icin.controller.AccountController;
import com.onlinebank.icin.controller.HomeController;


@WebMvcTest
class IcinApplicationTests {
	
	@Autowired
	MockMvc mockmvc;
	
	
	
	@InjectMocks
	private HomeController homecontroller;
	
	@Before(value = "/")
	public void setUp() throws Exception{
		mockmvc=MockMvcBuilders.standaloneSetup(homecontroller).build();
	}

	@Test
	void contextLoads() {
		try {
			mockmvc.perform(
					
					MockMvcRequestBuilders.get("/signup")
					).andExpect(status().isOk());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
