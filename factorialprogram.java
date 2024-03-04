package com.javaapplication;
import java.util.Scanner;

public class factorialprogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int i=1;
		 int fact=1;
		 while(i<=num)
		 {
			 fact=fact*i;
			 i++;
		 }
		System.out.println("factorial of "  + num +"  " + "is" +"  "+  fact);

	}

}