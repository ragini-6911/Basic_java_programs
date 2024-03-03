package com.javaapplication;

public class shiftoperator {

	public static void main(String[] args) {
		int x= 8;
		System.out.println(x>>2); //0100-->0*2^1 + 1*2^0--> 1
		System.out.println(x>>3);
		System.out.println(x<<2); //010000-->2^4--->16
		System.out.println(x>>>2);

	}

}
