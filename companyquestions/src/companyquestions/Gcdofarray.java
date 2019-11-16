package companyquestions;

import java.util.Scanner;

public class Gcdofarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
  int ar[]=new int[3];
  int t;
  int min=0;int gcd;
  for(int i=0;i<3;i++)
  {
	  ar[i]=s.nextInt();
	  
  }
  for(int i=0;i<3;i++)
  {
	  for(int j=i+1;j<3;j++)
	  {
		  if(ar[i]<ar[j])
		  {
			  t=ar[i];
			  ar[i]=ar[j];
			  ar[j]=t;
		  }
	  }
  }
  min=ar[9];
 
 int k=min;
  for(int i=0;i<3;i++)
  {
	  for(int j=i+1;j<3;j++)
	  {
		  if(ar[i]%k==0&&ar[j]%k==0)
		  
			
	    {
	    	gcd=i;
	    }
		  k++;
  }}
	}

}
