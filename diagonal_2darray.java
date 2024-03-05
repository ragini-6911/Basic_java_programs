package javaapplication;

public class diagonal_2darray {

	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		int sum = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == j) 
					sum = sum + a[i][j];
				}
			}

			System.out.print(sum);

		}
		
	}


