package companyquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Uniqueelementinarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int ar[]=new int[n+1];
		int flag=0;
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
          for(int j=i+1;j<n;j++)
          {
        	  if(ar[i]>ar[j])
        	  {
        		  int t=ar[i];
        		  ar[i]=ar[j];
        		  ar[j]=t;
        	  }
        	 
          }}
	
		for(int j=0;j<n;j++)
		{
			if(ar[j]!=ar[j+1])
			{
				System.out.println(ar[j]);
			}
		}
		

	
		
	}
}
