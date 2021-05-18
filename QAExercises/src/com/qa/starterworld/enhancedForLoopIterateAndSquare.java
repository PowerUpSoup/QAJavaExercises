package com.qa.starterworld;

public class enhancedForLoopIterateAndSquare {
	
	public static int[] array = new int[20]; 
	
	public static void main(String[] args) {
		createArray(array);
		squareArray(array);
	}

	public static void createArray(int[] array) {
		for(int i = 0; i < array.length ; i++) {
			array[i] = i + 1;
			System.out.println(array[i]);
		}
			
	}
	
	public static void squareArray(int[] array) {
		for(int num : array) {
			int result = num * num;
			System.out.println(result);
		}
	}
}
