package javaapplication;
import java.util.*;
 class OddNumException1 extends Exception{
	String msg;
	OddNumException1(String msg){
		super(msg);
	}
	
	
}

public class OddNumException {
	void number(int num) throws OddNumException1 {
		if(num%2!=0) {
			throw new OddNumException1("Number is odd");
		}
		else {
			System.out.println(num+ " is even");
		}
	}
	

	public static void main(String[] args) {
		OddNumException ob=new OddNumException();
		try {
			ob.number(7);
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+ e);
		}
		

	}

}
