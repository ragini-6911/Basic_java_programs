package javadoc;
import java.util.Scanner;

public class bankApp {
	
		
		String name;
		int accNo;
		int bal;
		Scanner sc= new Scanner(System.in);
		void details()
		{
			System.out.println("Enter the details: ");
			System.out.println("Enter your name");
			 name=sc.next();
			
			System.out.println("Enter your accNo");
			 accNo=sc.nextInt();
			
			System.out.println("Enter your bal");
			bal=sc.nextInt();
			
		}
		void display()
		{
			System.out.println("Your name is " +name);
			
			System.out.println("Your account number is "+accNo);
			System.out.println("Your balance is "+ bal);
		}
		void deposit()
		{
			//bal=1000;
			int amount;
			System.out.println("Enter the amount you want to deposit");
		    amount=sc.nextInt();
			bal=bal+amount;
			System.out.println("Your balance after deposit is "+bal);
		}
		void withDraw()
		{
			int Wamount;
			System.out.println("Enter the amount you want to withdraw");
			Wamount=sc.nextInt();
			if(Wamount<bal) {
				bal=bal-Wamount;
				System.out.println("your balance after withdraw is "+ bal);
				
			}
			else {
				System.out.println("You have insufficient balance");
			}
		}


	public static void main(String[] args) {
		bankApp ob=new bankApp();
		ob.details();
		ob.display();
		ob.deposit();
		ob.withDraw();

	}

}
