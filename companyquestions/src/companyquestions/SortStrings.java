package companyquestions;

import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in)
			   ;
	   System.out.println("enter a string");
	   String st=s.nextLine();
	   char c[]=st.toCharArray();
	   for(int i=0;i<(c.length-1);i++)
	   {
		   for(int j=i+1;j>0;j--)
		   {
			   if(c[j]<c[j-1])
			   {
				   char temp=c[j-1];
				   c[j-1]=c[j];
				   c[j]=temp;
						   
			   }
		   }
	   }
	 //  st=String.valueOf(c);
	   System.out.println(c);
	  }

}
