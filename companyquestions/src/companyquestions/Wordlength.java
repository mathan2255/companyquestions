package companyquestions;

import java.util.Scanner;

public class Wordlength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter word");
		String t=s.nextLine();
		int i=0;
		char[] c1=t.toCharArray();
	      for(char c:c1) {
	         i++;
	      }
	      System.out.println("Length of the string :"+i);
		

	}

}
