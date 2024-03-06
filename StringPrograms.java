package javafiles;

import java.awt.datatransfer.StringSelection;

import javax.naming.AuthenticationException;

public class StringPrograms {

	public static void main(String[] args) {
		String x= "RaGinI";
		String y= "ragini";
		int i =x.compareTo(y);
		String z=new String ("ragini");
		if(i==0) {
			System.out.println("both strings are equal");
			
		}
		 
			
		
		else{
			System.out.println("both the strings are not equal "+ i);
			
		}
		boolean b=x.equals(y);
		if(b==true) {
			System.out.println("both the strings are equal"+ b);
			
		}
		else {
			System.out.println("both the strings are not equal "+ b);
			
		}
		if(x==y) {
			System.out.println("both the strings are equal");
		}
		else {
			System.out.println("both the strings are not equal");
			
		}
		
		

	}

}
