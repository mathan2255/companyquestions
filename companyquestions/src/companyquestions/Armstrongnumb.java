package companyquestions;

import java.util.Scanner;

public class Armstrongnumb {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		double cnt=0;
		int t=n;
		int te=n;
		int i=0,a,r;
		double c=0;
		while(n!=0) {
		cnt++;
		n=n/10;
		}
		while(t!=0)
	    {
	    	a=t%10;
	    	c=c+Math.pow(a, cnt);
	    	t=t/10;
	    	
	    }
		if(c==te)
		System.out.println(te+" is armstrong");
		else
			System.out.println(te+" is not an armstrong");

	}

}
