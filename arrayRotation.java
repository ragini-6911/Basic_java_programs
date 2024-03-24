package com.javaapplication;
//import java.util.Arrays;

public class arrayRotation {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4};
			int n=2;	
			for(int i=0;i<n;i++) {
				int temp=arr[0],j;
				for( j=0;j<arr.length-1;j++) {

				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println("rotated array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
