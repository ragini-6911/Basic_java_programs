package javaabcd;
import java.io.*;

public class bufferedreader {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		  InputStreamReader reader=new InputStreamReader(System.in);    
		     BufferedReader br=new BufferedReader(reader);
		     System.out.println("Enter name");
		     String name=br.readLine();
		     System.out.println("Enter Age");
		     int age=Integer.parseInt(br.readLine());
		     System.out.println("Enter Salary");
		     Float Salary=Float.parseFloat(br.readLine());
		     {
		     System.out.println(name+" "+age+" "+Salary);

	}

}
}
