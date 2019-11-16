package companyquestions;

import java.util.Scanner;

public class Primefactorsofnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=s.nextInt();
		int i=1, c;		
		for(i=1;i<=number/2;i++)
		{ 
			c=0;
			if(number%i==0)
				//c++;
			//if(c==1)
				System.out.println(i);
				
		}
		

	}

}
