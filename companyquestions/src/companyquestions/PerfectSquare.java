package companyquestions;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int temp=n;
		double b=Math.sqrt(n);
		double c=b*b;
		if(c==temp)//if((b-Math.floor(b)==0))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
