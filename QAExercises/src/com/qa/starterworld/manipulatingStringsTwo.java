package com.qa.starterworld;

public class manipulatingStringsTwo {

	public static String str = "There once was a lady named Marge who had a job on a barge.";
	public static int count;
	public static String message = "a lady named Marge";
	
	public static void main(String[] args) {
		//wordCount(str);
		//printVertically(str);
		//printReversedVertically(str);
	}
	
	public static void wordCount(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			count += str.substring(i, i+1).equals("\s")  ? 1 : 0;
		}
		count += count > 0 ? 1 : 0;
		System.out.println(count);
	}
	
	public static void printVertically(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, (i+1)));
		}
	}
		
	public static void printReversedVertically(String str) {
		for (int i = str.length() - 1; i >= 0 ; i--) {
			System.out.println(str.substring(i, (i+1)));
		}
	}
	
	public static void findMessage(String str) {
		
	}
}
