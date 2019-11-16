package companyquestions;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		int p=s.nextInt();
		System.out.println("Enter the Number of years");
		int n=s.nextInt();
		System.out.println("Enter the rate of Interest");
		float r=s.nextFloat();
	Interest i=new Interest();
	System.out.println("SI ="+i.Inte(p, n, r));
	
		
		
		

	}

}
class Interest
{
	public float Inte(int p,int n,float r)
	{
		return (p*n*r)/100;
	}
}