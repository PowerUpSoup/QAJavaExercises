package com.qa.starterworld;


// Create an array that will hold 10 integer values, populate the array with values, then call and output each element.

public class basicArray {
	
	public static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	public static void main(String[] args) {
		for (int i : array) {
			System.out.println("The number is: " + i);	
			}
		}

	}
