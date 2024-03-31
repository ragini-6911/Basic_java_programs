package com.javaapplication;

public class employeeAssignmentques2 {
	String name;
	float salary;
	long hireDate;
	employeeAssignmentques2(String name,float salary,long hireDate){
		this.name=name;
		this.salary=salary;
		this.hireDate=hireDate;
	}
	void display() {
		long syears;
		long currentYear=2024;
		syears= currentYear-hireDate;
		System.out.println(name+" "+ salary+" "+ hireDate+" "+  "Years of Experience is "+syears);
	}
	

	public static void main(String[] args) {
		employeeAssignmentques2 tEmp=new employeeAssignmentques2("Ragini",50000,2020);
		employeeAssignmentques2 pEmp=new employeeAssignmentques2("Honey",200000,2015);
		tEmp.display();
		pEmp.display();

	}

}
