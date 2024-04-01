package javaapplication;
import java.io.*;
class Employee implements Serializable{
	int id;
	String name;
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
}


public class deSerialization {
	public static void main(String[] args) {
		try {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\DT055\\Desktop\\Ragini\\javaapplication\\src\\javaapplication\\fis.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp.id+" "+emp.name);
		
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

}
}

