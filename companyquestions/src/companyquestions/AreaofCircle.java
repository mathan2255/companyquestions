package companyquestions;

import java.util.Scanner;


public class AreaofCircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
				;
		System.out.println("Enter the radius");
		int radius=s.nextInt();
		float area=(float) (3.14*radius*radius);
		System.out.println("Area of circle ="+area);

	}

}
