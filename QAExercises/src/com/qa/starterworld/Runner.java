package com.qa.starterworld;

public class Runner {

	public static void main(String[] args) {
		Person a = new Person("Sean", 32, "Male");
		Book b = new Book("Gulliver's Travails", "Masked Author");
		
		System.out.println(a.name + " is " + a.age + " years old.");
		a.read(b);
	}
}
