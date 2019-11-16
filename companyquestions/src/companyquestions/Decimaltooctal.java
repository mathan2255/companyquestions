package companyquestions;

import java.util.Scanner;

public class Decimaltooctal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
				;
		System.out.println("Enter Decimal number");
		int decimal=s.nextInt();
		int i=1;
		int octal=0;
		while(decimal!=0)
		{
			int r=decimal%8;
			octal+=r*i;
			decimal/=8;
			i=i*10;
			
		}
		System.out.println(octal);

	}

}
