
package javaapplication;
import java.util.*;
class  InSufficientFundsException extends Exception{
	String msg;
	InSufficientFundsException(String msg)
	{
		super(msg);
	}	
}

public class exceptionAssignment2 {
	private int amount=1000;
	int tamount;
	int wamt;
	Scanner sc=new Scanner(System.in);
	void deposit() {
		int damt;
		System.out.println("Enter the amount you want to deposit");
		damt=sc.nextInt();
		tamount = amount + damt;
		System.out.println("Total amount after deposit is "+ tamount);
		
	}
	void withdraw() {
		int wamt;
		System.out.println("Entet the amount you want to withdraw");
		wamt=sc.nextInt();
		tamount = tamount - wamt;
		//
	}
	
		void balancecheck() throws InSufficientFundsException {
			if(tamount< wamt) {
				throw new InSufficientFundsException("insuffient balance ");
			}
			else {
				System.out.println("Total amount after withdraw is "+ tamount);
				
			}
		
	}
	

	public static void main(String[] args) {
		exceptionAssignment2 ob=new exceptionAssignment2();
		ob.deposit();
		ob.withdraw();
		try {
			ob.balancecheck();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+e);
		}

	}

}
