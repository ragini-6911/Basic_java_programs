package javaapplication;
import java.io.*;

public class fileOutputStream {

	public static void main(String[] args) {
		try {
			
		FileOutputStream fos=new FileOutputStream("//fis.txt");
		C:\\Users\\DT055\\Desktop\\Ragini\\javaapplication\\src\\javaapplication
		String s="Hello World";
		byte b[]= s.getBytes();
		fos.write(b);
		
		fos.close();
		System.out.println("success8");
}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
