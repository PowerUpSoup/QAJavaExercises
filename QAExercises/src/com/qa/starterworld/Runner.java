package com.qa.starterworld;

public class Runner {

	public static void main(String[] args) {
	 flowchart(32);
	 
	 flowchart(6032);
	}
	
	public static void flowchart(int a) {
		if (a > 2000) {
			System.out.println("A");
			
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
					if (a > 4000) {
						System.out.println("D");
					} else {
						System.out.println("E");
					}
			}
		} else {
			System.out.println("1");
			
			if (a > 100) {
				System.out.println("3");
			} else {
				System.out.println("2");
			}
		}
	};
}
