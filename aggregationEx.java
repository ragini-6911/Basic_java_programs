package com.javaapplication;

class aggregationEx{
	int id;
	String name;
	addressEx a;
	aggregationEx(int id,String name,addressEx a){
		this.id=id;
		this.name=name;
		this.a=a;
	}
	void display() {
		System.out.println(id+ " "+name+" "+a.city +" " +a.state);
	}
	public static void main(String[] args) {
		
		
		addressEx x= new addressEx("vizag", "AP");
		aggregationEx E1=new aggregationEx (2001,"RaginiK", x);
		E1.display();
	}
	

}

