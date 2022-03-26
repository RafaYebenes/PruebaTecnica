package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ICalculadora;
@Service
public class CalculadoraService implements ICalculadora{

	@Override
	public int suma(int a, int b) {
		return a + b;
	}

	@Override
	public int resta(int a, int b) {
		return a - b;
	}

}
