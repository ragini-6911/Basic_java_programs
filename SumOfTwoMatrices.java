package com.javaapplication;

public class SumOfTwoMatrices {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{3,4,5},
				{5,6,7},
		};
		int b[][]={
				{4,2,3},
				{3,4,9},
				{10,8,7},
		};
		int sum[][]=new int[3][3];
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				sum[i][j]=a[i][j]+b[i][j];

			}
		}
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				System.out.println(sum[i][j]+" ");
	}
			System.out.println();

}
		
	}
}
