package companyquestions;

import java.util.Scanner;

public class SegregateONEANDZERgivenarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=0;		
		int a[]= {0,1,0,1,0,1,0,1,1,0,1,0};
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			if(a[i]==0)
			{
				c++;
			}
		}
		for(int i=0;i<c;i++)
		{
			a[i]=0;
		}
		for(int i=c;i<l;i++)
		{
			a[i]=1;
		}
		
		for(int i=0;i<l;i++)
		{
		System.out.printf("%d ",a[i]);
		}
	}

}
