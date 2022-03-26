package com.example.demo.services;

import com.example.demo.interfaces.ICalculadora;

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
