package companyquestions;

import java.util.Scanner;

public class Hypotenuseofrightangledtriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
				;
		System.out.println("Enter one side");
		int side1=s.nextInt();
		System.out.println("Enter second side");
		int side2=s.nextInt();
		double hypot;
		double t;
		t=(side1*side1)+(side2*side2);
		hypot=Math.sqrt(t);
		System.out.println("Hypotenuse of right angled triangle is ="+hypot);


	}

}
