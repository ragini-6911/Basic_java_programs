package com.javaapplication;

public class employeeAssignment3 {
	String name;
	long joiningYear;
	double salary;
	String address;
	employeeAssignment3(String name,long joiningYear,double salary,String address){
		this.name=name;
		this.joiningYear=joiningYear;
		this.salary=salary;
		this.address=address;
	}
	void display() {
		System.out.println(name+"  "+joiningYear+"  "+salary+"  "+address);
	}


	public static void main(String[] args) {
		employeeAssignment3 emp1=new employeeAssignment3("Ramesh",1994,37500.75,"64C-James Street" );
		employeeAssignment3 emp2=new employeeAssignment3("Ssandeep",2000,42750.85,"68D- Bank Street");
		employeeAssignment3 emp3=new employeeAssignment3("Sandhya",1999,38785.25,"26B- Temple Lane");
		emp1.display();
		emp2.display();
		emp3.display();

	}

}
