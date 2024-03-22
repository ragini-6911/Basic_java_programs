package javaapplication;

public class reverseofString {

	public static void main(String[] args) {
	String str="ragini";
	//String S[]=str.split(" ");
	
	String rev=" ";
	//for(int i=0;i<S.length())
	for(int i=str.length()-1;i>0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);

	}

}
