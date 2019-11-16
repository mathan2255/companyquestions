package companyquestions;

import java.util.Scanner;

public class Replaceawith {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			
		
		if(c[i]=='a')
		{
			c[i]='$';
		}
		System.out.print(c[i]);
		}	

	}

}
