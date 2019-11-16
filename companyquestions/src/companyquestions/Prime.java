package companyquestions;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
	int n=s.nextInt();
	int i,j;

	for(i=2;i<=n;i++)
	{
		int c=0;
		for(j=2;j<=i;j++)
		{
			if(i%j==0)
			{
			  c++;
			}
			
		}
		
		
		if(c==1)
		System.out.printf("%d ",i);
		
	}
	

	}

}
