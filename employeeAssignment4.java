package com.javaapplication;
import java.util.*;

public class employeeAssignment4{
	float salary;
	int noOfWHours;
	public void getInfo(float salary,int noOfWHours){
		this.salary=salary;
		this.noOfWHours=noOfWHours;
	}
	
	public void AddSal() {
	
		if(salary<5000) {
			salary = salary+1000;
			
		}
	}
	public void AddWork() {
		if(noOfWHours>6) {
			salary= salary + 500;
		}
	}
	void finalSal() {
		System.out.println("final salary is "+ salary);
		
	}

	public static void main(String[] args) {
		employeeAssignment4 emp=new employeeAssignment4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		float salary =sc.nextFloat();
		System.out.println("Enter your working hours in a day");
		int noOfWHours=sc.nextInt();
		
		emp.getInfo(salary,noOfWHours);
		emp.AddSal();
		emp.AddWork();
		emp.finalSal();
		sc.close();
		

	}

}

