package companyquestions;

import java.util.Scanner;

public class Leapyearperfectnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
				;
		System.out.println("Enter the Year");
		int year=s.nextInt();
		int t=year;
		int flag=0,sum=0;
		if(t%4==0||t%100==0||t%400==0)
		{
			flag=1;
		}
		else
		{
			System.out.println("not a leap year");
		}
		
		
		if(flag==1)
		{
			for(int i=1;i<t/2;i++)
			{
				if(t%i==0)
				{
					sum+=i;
				}
			}
			
			
		
		if(sum==year)
		{
			System.out.println("Perfect number");
			
		}
		else
		{
			System.out.println("not a Perfect number");
		}
	}}

}
