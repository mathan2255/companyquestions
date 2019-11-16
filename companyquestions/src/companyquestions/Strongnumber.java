package companyquestions;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int temp=n;
	int f,sum = 0,i,rem;
	while(temp>0)
	{
	f=1;
	i=1;
	rem=temp%10;
	while(i<=rem)
	{
		f=f*i;
		i++;
	}
sum=sum+f;
temp=temp/10;
	}
	if(n==sum)
	System.out.println("STRONG NUMBER");
	else
		System.out.println("NOT STRONG NUMBER");
	
	}


}