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
class puppy extends dog{
	void weep() {
		System.out.println(" weeping");
	}
}

public class multiLevel {

	public static void main(String[] args) {
		puppy p=new puppy();
		p.weep();
		p.bark();
		p.eat();

	}

}
