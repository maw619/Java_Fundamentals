package com.polymorphism;

public class Polymorphism_App {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.speak();
		
		Dog dog = new Dog();
		dog.speak();
		
		Cat cat = new Cat();
		cat.speak();
	}

}
