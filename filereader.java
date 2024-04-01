package javaapplication;
import java.io.*;

public class filereader {

	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("C:\\Users\\DT055\\Desktop\\Ragini\\javaapplication\\src\\javaapplication\\fis.txt");
		int i=0;
		while((i=fr.read())!= -1) {
		System.out.print((char)i);	
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		


		

	}

}
