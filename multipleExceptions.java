package javaapplication;

public class multipleExceptions {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.charAt(1));

		int div;
		div=100/0;
		System.out.println(div);
		int a[]=new int[4];
		System.out.println(a[5]);
		
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		}

}
