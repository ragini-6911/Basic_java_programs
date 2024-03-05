package com.javaapplication;
import java.util.Arrays;

public class arrays_greatestofall {

	public static void main(String[] args) {
		int arr[]= {10,3,2,3,9,5};
		
			Arrays.sort(arr);
			
		
		System.out.println( "sorted array is " + Arrays.toString(arr));
		System.out.println("greatest of all the elements is "  + (arr.length-1));
		

	}

}
