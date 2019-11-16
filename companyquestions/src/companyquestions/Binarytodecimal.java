package companyquestions;

import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n=s.nextInt();
		int r,pow=1,sum=0;
		int t=n;
		while(t!=0)
		{
			r=t%10;
		t=t/10;
		sum=sum+r*pow;
		pow=pow*2;
		}
		System.out.println(sum);

	}

}
