package companyquestions;

import java.util.Scanner;

public class Tempconversionctof {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temp in celsius");
		double c=s.nextDouble();
		double f=(c*9/5)+32;
		System.out.println("Temp in fahrenhiet :"+f);

	}

}
