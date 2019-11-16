package companyquestions;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n=s.nextInt();
		int r[]=new int[30];
		int i=0;int a;
		while(n>0)
		{    a=n%2;
			 r[i]=a;
					 
			 n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(r[j]);
		}

	}

}
