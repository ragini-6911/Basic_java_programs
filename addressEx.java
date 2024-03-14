package com.javaapplication;

public class addressEx {
		String city;
		String state;
	addressEx(String city,String state){
		this.city=city;
		this.state=state;
	}
	void display() {
		System.out.println(city+" "+state);
	}


	public static void main(String[] args) {
		addressEx ob=new addressEx("vizag","AP");
		ob.display();

	}

}
