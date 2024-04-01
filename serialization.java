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

public class serialization {

	public static void main(String[] args) {
		try {
		Employee emp=new Employee(101, "Ragini");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\DT055\\Desktop\\Ragini\\javaapplication\\src\\javaapplication\\fis.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

}
}
