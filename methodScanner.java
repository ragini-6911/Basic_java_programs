package com.javaapplication;
import java.util.Scanner;


public class methodScanner {
	Scanner sc=new Scanner(System.in);
	String name; 
	int id;
	void accept() {
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter id");
		id=sc.nextInt();
		
	}
	void display(){
		System.out.println("name is " +name);
		System.out.println("id is " +id);
	}

	public static void main(String[] args) {
		methodScanner ob=new methodScanner();
		ob.accept();
		ob.display();

	}

}
