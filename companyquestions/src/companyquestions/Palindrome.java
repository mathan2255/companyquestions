package companyquestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=n;
		int r=0,sum=0;
		
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(a==sum)
		{
			System.out.println("number is palindrome");
		}
		else
			System.out.println("not a palindrome");
	}

	}

