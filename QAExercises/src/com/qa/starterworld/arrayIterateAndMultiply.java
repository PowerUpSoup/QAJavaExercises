package com.qa.starterworld;


// Create a for loop that populates an integer array with values, outputting them at each iteration.
// Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

public class arrayIterateAndMultiply {

	public static int[] array = new int[10];
	
	public static void main(String[] args) {
		fillArray();
		multiplyArray();
	}
	
	public static void fillArray() {
		for (int i = 0 ; i < array.length; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
	}
	
	public static void multiplyArray() { 
		for (int i = 0 ; i < array.length; i++) {
			array[i] = array[i] * 10;
			System.out.println(array[i]);
		}
	}

}
