package companyquestions;
import java.util.*;

public class Main {
	
	  public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    Shape sh=new Shape();
	    new Shape();
  	    
        System.out.println("1.Cube\n2.Sphere\n3.Cylinder");
	    System.out.println("Enter the choice");
	    int choice=s.nextInt();
	    switch(choice)
	    {
	      case 1:
	      {
	        System.out.println("length");
	      int  l=s.nextInt();
	        System.out.println("breadth");
	     int   b=s.nextInt();
	        System.out.println("height");
	     int   h=s.nextInt();
	        new   Shape(l,b,h);
	        System.out.println("Area of Cube is "+ sh.calculateAreaOfCube());
	        
	        
	        break;
	      }
	      case 2:
	      {
	      System.out.println("radius");
	    int   r=s.nextInt();
	       new    Shape(r);
	      System.out.println("Area of Sphere is "+sh.calculateAreaOfSphere());
	      
	       break;
	      }
	      case 3:
	      {
	        System.out.println("radius");
	      int   r=s.nextInt();
	        System.out.println("height");
	      int   h=s.nextInt();
	         new Shape(r,h);
	       System.out.println("Area of Cylinders is "+sh.calculateAreaOfCylinder());
	        
	        break;
	      }
	      default:
	      System.out.println("Enter the correct choice");
	  }
	}
	}

  class Shape
	  {
	    int length,breadth,height,radius;
	    Shape()
	    {
	      length=0;
	      breadth=0;
	      height=0;
	      radius=0;
	    }
	    Shape(int a,int b,int c)
	    {
	      length=a;
	      breadth=b;
	      height=c;
	    }
	     Shape(int r)
	    {
	     radius=r;
	    }
	     Shape(int a,int b)
	    {
	      radius=a;
	      height=b;
	    }
	    
	   public double calculateAreaOfCylinder() 
	   {
	     return (3.14*2*radius*height)+(2*3.14*radius*radius);
	   }
	     
	   public double calculateAreaOfSphere()
	   {
	     return 4*3.14*(radius*radius);
	   }
	    public Integer calculateAreaOfCube()
	    { 
	      if(length==breadth&&length==height)
	      {
	      return 6*length*length;
	      }
	      else
	      {
	        return 0;
	      }
	    }
	  
	}


