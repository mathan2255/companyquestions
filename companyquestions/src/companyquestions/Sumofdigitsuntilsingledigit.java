package companyquestions;

import java.util.Scanner;

public class Sumofdigitsuntilsingledigit {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0,a;
	while(n>0||sum>9)
	{   
		if(n==0)
		{
			n=sum;
			sum=0;
		}
		
		
		sum=sum+n%10;
		n=n/10;
		
	}
	
	System.out.println(sum);

	}

}
