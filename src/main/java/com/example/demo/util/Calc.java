package com.example.demo.util;

import org.springframework.stereotype.Service;

@Service
public class Calc {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multifly(int num1, int num2) {
		return num1 * num2;
	}
	
	public int division(int num1, int num2) {
		return num1 / num2;
	}
}
