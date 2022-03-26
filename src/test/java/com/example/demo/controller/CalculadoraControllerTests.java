package com.example.demo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@SpringBootTest
public class CalculadoraControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testSuma() {
		try {
			int res = Integer.parseInt(mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/calculadora/suma/2/2")).andReturn().getResponse().getContentAsString());
			assertEquals(4, res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testResta() {
		try {
			int res = Integer.parseInt(mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/calculadora/resta/5/2")).andReturn().getResponse().getContentAsString());
			assertEquals(3,res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
