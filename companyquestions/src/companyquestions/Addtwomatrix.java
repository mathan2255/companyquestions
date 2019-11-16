package companyquestions;

import java.util.Scanner;

public class Addtwomatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows and column");
		int r=s.nextInt();
		int c=s.nextInt();
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		int m3[][]=new int[r][c];
		System.out.println("Enter first");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				
				m1[i][j]=s.nextInt();
			}
			
		}
		System.out.println("Enter second");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				
				m2[i][j]=s.nextInt();
			}
			
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				
				m3[i][j]=m1[i][j]+m2[i][j];
			}
		

	}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				
				System.out.print(m3[i][j]+" ");
				
			}
			
			System.out.println();
	}


}
}