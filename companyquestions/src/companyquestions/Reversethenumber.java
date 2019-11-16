package companyquestions;

import java.util.Scanner;

public class Reversethenumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		System.out.println("Reverse of the number is "+sum);

	}

}
