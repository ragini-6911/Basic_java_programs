package javaapplication;

import java.util.*;

public class SumOfRows_2dArray {

	public static void main(String[] args) {
		int arr[][] = new int[2][2];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array elements");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();

				System.out.print(arr[i][j]+"");
			}
		}

		System.out.println("Elements of the matrix are");
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)

				System.out.print(arr[i][j]);
		System.out.println();

		
		for (int i = 0; i < 2; i++) {
			int row_sum = 0;

			for (int j = 0; j < 2; j++) {
				row_sum = row_sum + arr[i][j];
			}
			System.out.println("row sum is " + (i+1) + "row is "+ row_sum);
		}

	}
}
