package javaapplication;

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
	
static	void display( user x[]) {
		for(int i=0;i<2;i++) {
			System.out.println(x[i].name+" " +x[i].age+" "+x[i].salary);	
		}
	
		
	}
	
}

public class userinputBufferreader1 {
	
		public static void main(String[] args)throws IOException {
			
			
			user a[]=new user[5];
			int i;
			  InputStreamReader reader=new InputStreamReader(System.in);    
			     BufferedReader br=new BufferedReader(reader);
			     for(i=0;i<2;i++) {
			     System.out.println("Enter name");
			     String name=br.readLine();
			     System.out.println("Enter Age");
			     int age=Integer.parseInt(br.readLine());
			     System.out.println("Enter Salary");
			     Float Salary=Float.parseFloat(br.readLine());
			     
			    
			     a[i]=new user(name, age, Salary);}
			    //a[i].display();
			  //   user ob=new user();
			    
			    	 user.display(a);
			    	 
			   
	}

	}

	
