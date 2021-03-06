package com.qa.starterworld;

public class Results {
	
	int physics;
	int chemistry;
	int biology;
	int total;
	int percentage;
	
	public static void main(String[] args ) {
		int physics = 100;
		int chemistry = 10;
		int biology = 98;
		
		resultsTotal(physics, chemistry, biology);
	}
	
	public static void resultsTotal(int physics, int chemistry, int biology) {
		System.out.println("The score for Physics: " + physics);
		System.out.println("The score for Chemistry: " + chemistry);
		System.out.println("The score for Biology: " + biology);
		
		int total = physics + chemistry + biology;
		
		System.out.println("Total score is " + total + " out of 450.");
		
		resultsPercentage(total);
	}
	
	public static void resultsPercentage(int total) {
		int percentage = total * 100 / 450;
		
		System.out.println("You scored this percentage overall: " + percentage);
		
		if (percentage >= 60) {
			System.out.println("You passed!");
		} else { 
			System.out.println("You have failed...");
		}
	}
} 