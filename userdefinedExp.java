package javaapplication;

class NegativeNumberExcetion extends Exception{
	NegativeNumberExcetion(String msg)
	{
		super(msg);
	}

}
public class userdefinedExp 
{
	

	void num(int n) throws NegativeNumberExcetion
	{
		if(n<0) {
			throw new NegativeNumberExcetion("Invalid Number");
		}
	}

	public static void main(String[] args) throws NegativeNumberExcetion {
		userdefinedExp udf=new userdefinedExp();
		try {
			udf.num(-1);
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+ e);
		}
		System.out.println("end of the code");

	}

}
