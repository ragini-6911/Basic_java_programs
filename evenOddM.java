package com.javaapplication;

public class evenOddM {
	int print(int num) {
		if(num%2==0) {
			System.out.println(num+ " is even");
		}
		else {
			System.out.println(num + " is odd");
		}
		return 0;
	}

	public static void main(String[] args) {
		evenOddM ob=new evenOddM();
		int x= ob.print(10);
		int y= ob.print(5);
		int z= ob.print(11);
		int w= ob.print(6);
		int u= ob.print(99);
		
	
		

	}

}
