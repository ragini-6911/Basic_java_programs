package com.javaapplication;
class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class cat extends Animal{
	void meow() {
		System.out.println(" meowing");
	}
}

public class hierarchicalEx {

	public static void main(String[] args) {
		cat c=new cat();
		c.eat();
		c.meow();

	}

}
