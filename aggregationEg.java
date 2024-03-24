package com.javaapplication;

public class aggregationEg {
	int n,result;
	 aggregationEg(int n){
		this.n=n;
	  result = n*n;
	}
	void display() {
		System.out.println("area of square is"+ result);
	}
	

	public static void main(String[] args) {
		aggregationEg ob= new aggregationEg(5);
		ob.display();

	}

}
