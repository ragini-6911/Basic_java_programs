package com.javaapplication;

public class encapEx {
	private int id;
	private String password;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}

	public static void main(String[] args) {
		encapEx ob=new encapEx();
		ob.setId(2001);
		System.out.println(ob.getId());
		encapEx ob2=new encapEx();
		ob2.setPassword("Ragini");
		System.out.println(ob2.getPassword());

	}

}
