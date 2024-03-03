package com.javaapplication;

public class assignmentoperator {
	public static void main(String[] args) {
		
		int a=10;
		a+=5;
		int b=20;
		b-=5;
		int c=5;
		c*=5;
		int d=25;
		d/=5;
		d>>=2;

		System.out.println(a); //a=a+5-->15
		System.out.println(b); //b=b-5-->15
		System.out.println(c); //c=c*5-->25
		System.out.println(d); //d=d/5-->5-->0101-->1
	}

}
