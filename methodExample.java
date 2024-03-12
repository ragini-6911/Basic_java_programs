package com.javaapplication;

public class methodExample {
	int factnum(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
			
		}
		return fact;
			
	}
	

	public static void main(String[] args) {
		methodExample ob=new methodExample();
		int x=ob.factnum(5);
		System.out.println("factorial of the number is "+ x);
		System.out.println("factorial is "+ ob.factnum(5));

	}

}
