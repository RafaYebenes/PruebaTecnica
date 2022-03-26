package com.example.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.services.CalculadoraService;
@SpringBootTest
public class CalculadoraServiceTests {

	
	private CalculadoraService calService = new CalculadoraService();
	
	@Test
	public void testSuma() {
		int result = calService.suma(2, 2);
		assertEquals(4, result);
	}
	
	@Test
	public void testResta() {
		int result = calService.resta(2, 2);
		assertEquals(0, result);
	}
}
