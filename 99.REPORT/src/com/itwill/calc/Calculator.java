package com.itwill.calc;

public class Calculator {

	/*
	 * int result = cal.add(34,35) int result = cal.sub(34,35) int result =
	 * cal.mul(34,35) int result = cal.div(34,35)
	 */
	
	private Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static int add(int a, int b) {

		int result;
		result = a + b;
		return result;

	}

	public static int sub(int a, int b) {

		int result;
		result = a - b;
		return result;
	}

	public static int mul(int a, int b) {

		int result;
		result = a * b;
		return result;
	}

	public static double div(int a, int b) {

		int result;
		result = a / b;
		return result;

	}

}
