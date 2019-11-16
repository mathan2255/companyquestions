package companyquestions;

import java.util.Scanner;

public class Circumfranceofcircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter the radius of the circle");
		c.setR(s.nextInt());
		System.out.println("Circumfrance of a circle is :"+c.calc());

	}

}
class Circle
{
	int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	

public double calc()
{
	return 2*3.14*getR();
}
}