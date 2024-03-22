package javaapplication;

public class revEachWordInString {

	public static void main(String[] args) {
		String str="this is Java";
		String words[]=str.split(" ");
		String rev=" ";
		for(String word:words) {
			String rev_word=" ";
			for(int j=word.length()-1;j>=0;j--) {
				rev_word=rev_word+word.charAt(j);
			}
			rev=rev+rev_word+" ";
			}
			
		
		
		System.out.println(rev);

	}

}
