package com.javaapplication;

public class sumMethod {
	int sum(int a,int b) {
		int c=a+b;
		System.out.println("sum is " +c);
		
		return c;
	}
	

	public static void main(String[] args) {
		sumMethod ob= new sumMethod();
		int y= ob.sum(11, 52);
		int x= ob.sum(2,34);
		int w= ob.sum(10, 4);
		int a= ob.sum(5, 9);
		

	}

}
