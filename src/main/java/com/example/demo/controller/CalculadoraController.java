package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.ICalculadora;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	
	@Autowired
	ICalculadora calculadoraService;
	
	@GetMapping("/suma/{a}/{b}")
	public int suma(@PathVariable("a") int a, @PathVariable("b") int b) {
		return calculadoraService.suma(a, b);
	}
	
	@GetMapping("/resta/{a}/{b}")
	public int resta(@PathVariable("a") int a, @PathVariable("b") int b) {
		return calculadoraService.resta(a, b);
	}
	
}
