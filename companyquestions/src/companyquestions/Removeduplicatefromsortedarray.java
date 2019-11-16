package companyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Removeduplicatefromsortedarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
				;
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size+1];
		int a1[]=new int[size+1];
		System.out.println("Enter array elments");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			
		}
		Arrays.sort(a);
		
		int j=0;
	for(int i=0;i<size;i++)
		{
				
			if(a[i]!=a[j+1])
			{
				a1[j++]=a[i];
				
			}
			a1[j++]=a[size-1];
				System.out.println(a[j]);
			
			
		}
		
		
		
		
		

	}

}
