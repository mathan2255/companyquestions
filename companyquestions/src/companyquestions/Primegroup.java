package companyquestions;

import java.util.Scanner;

public class Primegroup {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
	int n=s.nextInt();
	int i,j;

	for(i=2;i<=n;i++)
	{
		int c=0;
		for(j=3;j<=i;j++)
		{
			if(i%j==0||(i+2)%j==0)
			{
			  c++;
			}
			
		}
		
		
		if(c==1)
			//System.out.println(i);
		//System.out.printf("(%d ,%d )",i,i+2);
		System.out.println("("+(i)+","+(i+2)+")");
		
	}
	

	}

}
