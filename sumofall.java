package com.javaapplication;

public class sumofall {

	public static void main(String[] args) {
		int number=256;
		int digit, sum=0;
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("sum of all the digits is" + " " + sum);

	}

}
