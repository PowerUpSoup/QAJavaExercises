package com.qa.starterworld;

public class Calculator {
	
	static int num1 = 7;
	static int num2 = 5;
	static double product;

	public static void main(String[] args) {
		calculateAdd(num1, num2);
		calculateMult(num1, num2);
		calculateSubt(num1, num2);
		calculateDiv(num1, num2);
	};
	
	public static void calculateAdd(int num1, int num2) {
		product = num1 + num2;	
		System.out.println(product);
	};
		
	public static void calculateMult(int num1, int num2) {
		product = num1 * num2;
		System.out.println(product);
	};
	
	public static void calculateSubt(int num1, int num2) {
		product = num1 - num2;
		System.out.println(product);
	};
	
	public static void calculateDiv(double num1, double num2) {
		if (num1 <= num2) 
			{
				product = num1 / num2;
				System.out.println(product);
			} else {
				System.out.println("The division could not be performed.");
			};
	};
}
