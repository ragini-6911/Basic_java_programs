package javaapplication;
import java.lang.*;

public class exceptionhandling {
		void age(int num)
		{
			if(num<0) {
				throw new ArithmeticException("Invalid Number");
			}
		}
		

	public static void main(String[] args) {
		exceptionhandling ob=new exceptionhandling();
		try {
			ob.age(-9);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("terminate here");
		
		
				

	}

}
