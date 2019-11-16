package companyquestions;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in)
			;
	String a=s.nextLine();
	String rev="";
	for(int i=a.length()-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);
	}
	if(a.equals(rev))
System.out.println(a+" is palindrome");
	else
		System.out.println(a+" is not palindrome");

	}

}
