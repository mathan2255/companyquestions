package companyquestions;
import java.util.*;
public class Main3 {
	
	
	  public static void main(String args[])
	  {
	    String name,color;
	    float cc;
	    int speed,manudisc,weight;
	    double price=0;
	    
	     System.out.println("Enter the details of Sports Bike"); 
	    
	   // Scooter sc=new Scooter(name,color,cc,speed,price,manudisc);
	     System.out.println("Enter the details of Scooter"); 
	     Bike.show();
	    Bike.show();
	   // SportBike sb=new SportBike(name, color, cc, speed, price, manudisc,weight);
	 
	  
	    
	  }
	}
	class Bike
	{
	  private static  String name;
	  private static String color;
	  private static  float cc;
	  private static int speed;
	  private static int manudisc;
	  private int weight;
	  private static double price;
 public static void show()
	  {Scanner s=new Scanner(System.in);
	    System.out.println("Name of the bike :");
	    name=s.nextLine();
	System.out.println("Color of the bike :");
	    color=s.nextLine();
	System.out.println("Capacity(CC) of the bike :");
	    cc=s.nextFloat();
	System.out.println("Speed of the bike :");
	    speed=s.nextInt();
	System.out.println("Price of the bike :");
	    price=s.nextDouble();
	System.out.println("Discount of the bike: ");
	    manudisc=s.nextInt();
	  }
	  
	}
	class SportBike extends Bike
	{ 
	public SportBike(String name, String color, Float cc, Integer speed, Double price,Integer manudisc)
	{
	System.out.println("Sports Bike :");
	System.out.println("Name : "+name);
	System.out.println("Color : "+color);
	System.out.println("Capacity : "+cc);
	System.out.println("Speed : "+speed);
	System.out.println("Price : "+price);
	//System.out.println("Weight : "+weight);
	System.out.println("Manufacturer Discount : "+manudisc);
	System.out.println("Scooter price is "+(price-manudisc));

	}
	}
	class Scooter extends Bike
	{
	 public Scooter(String name, String color, Float cc, Integer speed, Double price, Integer manudisc,int weight)
	 {
	System.out.println("Scooter :");
	System.out.println("Name : "+name);
	System.out.println("Color : "+color);
	System.out.println("Capacity : "+cc);
	System.out.println("Speed : "+speed);
	System.out.println("Price : "+price);
	System.out.println("Weight : "+weight);
	System.out.println("Manufacturer Discount : "+manudisc);
	System.out.println("Scooter price is "+(price-manudisc));
	 
	 }
	}



