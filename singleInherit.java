package com.javaapplication;
 class Animal {
		void eat() {
			System.out.println(" eating");
		}
	}

	class dog extends Animal {
		void bark() {
		System.out.println(" barking");
	}
	}
	public class singleInherit{

	public static void main(String[] args) {
		dog d=new dog();
		d.eat();
		d.bark();
		
		

	}

}