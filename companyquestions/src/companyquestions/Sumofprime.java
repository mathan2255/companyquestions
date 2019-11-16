package companyquestions;

import java.util.Scanner;

public class Sumofprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=s.nextInt();
		int i=0,j=0,c,sum=0;
		for(i=2;i<limit;i++)
		{
			c=0;
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
					
				}
			}
			if(c==1)
				
				//System.out.println(i);
			sum=sum+i;
			
		
		}
		
		System.out.println("Sum of prime numbers is :"+sum);

	}

}
