package companyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");

		int n=s.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("Enter the position");
		int pos=s.nextInt();
		System.out.println("Enter the  element to be inserted");
		int num=s.nextInt();
		for(int i=n-1;i>=pos;i--)
		{
			
				a[i+1]=a[i];
				//a[i-1]=num;
				a[pos]=num;
		}
		
			
			System.out.println(Arrays.toString(a));
				
		


	}

}
