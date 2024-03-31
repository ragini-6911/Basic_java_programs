package com.javaapplication;

public class assignmentQues1 {
	 private String name;
	 private int id;
	private long phno;
	static String course= "Java";
	assignmentQues1(String name,int id,long phno){
		this.name=name;
		this.id=id;
		this.phno=phno;
		this.course=course;
	}
	void display() {
		System.out.println(name+" "+id+" "+phno+" "+course);
	}
	

	public static void main(String[] args) {
		assignmentQues1 ob1=new assignmentQues1("Ragini",101,1234567890);
		assignmentQues1 ob2=new assignmentQues1("Honey",102,1876543210);
		ob1.display();
		ob2.display();

	}

}
