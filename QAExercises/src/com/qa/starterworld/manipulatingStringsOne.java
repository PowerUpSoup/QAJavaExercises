package com.qa.starterworld;

public class manipulatingStringsOne {

	public static String stringOne = "Today it is sunny, ";
	public static String stringTwo = "yesterday it was raining.";
	public static String mySubString1 = stringOne.substring(0, 11);
	public static String mySubString2 = stringTwo.substring(16, 24);
	
	public static void main(String[] args) {
		System.out.println(stringOne.toUpperCase()+" "+stringTwo.toUpperCase());
		System.out.println(mySubString1 + mySubString2);
	}

	
}
