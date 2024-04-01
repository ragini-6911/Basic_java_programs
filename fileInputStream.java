package javaapplication;
import java.io.*;


public class fileInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\DT055\\Desktop\\Ragini\\javaapplication\\src\\javaapplication\\fis.txt");
			
			int i=0;
			while((i=fis.read())!= -1) {
			System.out.print((char)i);
	
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+e);
		}

	}

}
