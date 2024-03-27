package javaabcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class user{
	String name;
	int age;
	float salary;
	user(String name,int age,float salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	void display() {
		System.out.println(name+" " +age+" "+salary);
	}
	
}

public class userinputBufferreader {
	
		public static void main(String[] args)throws IOException {
			user a[]=new user[5];
			int i;
			  InputStreamReader reader=new InputStreamReader(System.in);    
			     BufferedReader br=new BufferedReader(reader);
			     for(i=0;i<5;i++) {
			     System.out.println("Enter name");
			     String name=br.readLine();
			     System.out.println("Enter Age");
			     int age=Integer.parseInt(br.readLine());
			     System.out.println("Enter Salary");
			     Float Salary=Float.parseFloat(br.readLine());
			     {
			    
			     a[i]=new user(name, age, Salary);
			    a[i].display();

		}
			     }

	}

}
