package javaapplication;
import java.io.*;

public class filewriter {

	public static void main(String[] args) {
		try {
		FileWriter fw= new FileWriter("C:\\Users\\DT055\\Desktop\\Ragini\\javaapplication\\src\\javaapplication\\fis.txt");
		fw.write("This is java Programming");
		fw.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}


	}

}
