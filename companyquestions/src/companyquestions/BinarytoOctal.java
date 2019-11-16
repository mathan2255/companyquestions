package companyquestions;

import java.util.Scanner;

public class BinarytoOctal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter binary digit");
		int binary=s.nextInt();
		int decimal=0,r1,r2;
		int octal=0;
		int i=0;
		while(binary!=0)
		{
		
			r1=binary%10;
		    decimal+=r1*Math.pow(2, i);
		    binary/=10;
		    i++;
		}
		System.out.println(decimal);
		i=1;
		while(decimal!=0)
		{   
			r2=decimal%8;
			octal+=r2*i;
			decimal/=8;
			i=i*10;
		}
		System.out.println("Octal number is :"+octal);

	}

}
