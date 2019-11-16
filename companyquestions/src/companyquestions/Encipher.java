package companyquestions;

import java.util.Scanner;

public class Encipher {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  String c=s.nextLine();
	  int a=s.nextInt();
	  char ch=0;
	  for(int i=0;i<c.length();i++)
	  {
		  ch=(char) (c.charAt(i)+a);
		  System.out.print(ch);
		  
	  }

	}

}
