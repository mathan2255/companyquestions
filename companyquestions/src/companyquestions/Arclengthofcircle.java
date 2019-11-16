package companyquestions;

import java.util.Scanner;

public class Arclengthofcircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the diameter and Angle of the circle");
		double d=s.nextInt();
		double angle=s.nextInt();
		double angle1=angle/360;
		double arclength=(2*3.14*d)*angle1;
		System.out.println(arclength);

	}

}
