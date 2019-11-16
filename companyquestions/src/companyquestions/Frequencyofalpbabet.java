package companyquestions;

import java.util.Scanner;

public class Frequencyofalpbabet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		int l=str.length();
		int freq[]=new int[l];
		char ch[]=str.toCharArray();
		
		int i=0,j=0;
		for(i=0;i<l;i++)
		{  
			freq[i]=1;
			for(j=i+1;j<l;j++)
			{
				if(ch[i]==ch[j])
				{
					freq[i]++;
					ch[j]=0;
				
					
				}
				
			}
		}
		
		for(i=0;i<freq.length;i++)
		{
			
		if(ch[i]!=0)
		System.out.println(ch[i]+"-"+freq[i]);
		
		

	     }

}
}