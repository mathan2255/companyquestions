package companyquestions;

import java.util.*;

public class Main4 {
	
	  public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    String title=s.nextLine();
	    Mymovie m=new Mymovie();
	    m.setTitle(title);
	    System.out.println("The title is: "+m.getTitle());
	    
	  }
	}
	abstract class Movie
	{
	  public String getTitle()
	  {
	   
		return getTitle();
	  }
	  abstract void setTitle(String s);
	  
	  }
	  class Mymovie extends Movie
	  {
	      String title;
	    void setTitle(String title)
	    { super.getTitle();
	     this. title=title;
	    }
 }


