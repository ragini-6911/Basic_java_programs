package com.javaapplication;
import java.util.Scanner;

public class calculatorprogram {

	public static void main(String[] args) {
		
		char operator;
		int number1,number2,result;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
		System.out.println("choose an operator +, -, *, /, %");
	    operator= sc.next().charAt(0);
	    System.out.println("enter first number");
        number1 =sc.nextInt();
        System.out.println("enter second number");
        number2 =sc.nextInt();
        switch(operator) {
        case '+':
        	result= number1+number2;
        	System.out.println("result is" + result);
            break;
        case '-':
        	result= number1-number2;
        	System.out.println("result is" + result);
            break;
        case '*':
        	result= number1*number2;
        	System.out.println("result is"+ result);
            break;
        case '/':
        	result= number1/number2;
        	System.out.println("result is"+ result);
            break;
        case '%':
        	result= number1%number2;
        	System.out.println("result is"+ result);
            break;
    
        default:
       
        	
        	System.out.println("invalid operator");
        	break;
        }
            
        
        
	    
	    
		

	}

}
}
