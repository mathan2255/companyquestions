package companyquestions;

import java.util.Scanner;

public class Factorialofnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
				;
		System.out.println("Enter the number");
		int number=s.nextInt();
		int f=1;
		for(int i=1;i<=number;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial is ="+f);

	}

}
