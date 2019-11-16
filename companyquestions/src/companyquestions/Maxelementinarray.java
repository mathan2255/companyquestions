package companyquestions;

import java.util.Scanner;

public class Maxelementinarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int ar[]=new int[n];
		int max=0;
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max);
		

	}

}
