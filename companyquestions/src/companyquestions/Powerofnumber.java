package companyquestions;

import java.util.Scanner;

public class Powerofnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				
				
		 int n = s.nextInt();
		int pow =s.nextInt();
	        double result = 1;
	        while (pow!= 0)
	        {
	            result *=n;
	            pow--;
	        }
	        System.out.println("Answer = " + result);

	}

}
