package companyquestions;

import java.util.Scanner;

public class Searchelement {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter limit");
	int n=s.nextInt();
	int flag=0;
	int arr[]=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++)
	{
     arr[i]=s.nextInt();
	}
	System.out.println("Enter element to be searched");
    int num=s.nextInt();
    for(int i=0;i<n;i++)
	{ 
    	if(arr[i]==num)
    	{
    		flag=1;
    	}
    	else
    	{
    		flag=0;
    	}
    }
    		
    	if(flag==1)
    		System.out.println("Number is present");
    	else
    		System.out.println("not pressent");
	
	}
}
