package companyquestions;

import java.util.Scanner;

public class Deletevowelsinstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in)
				;
		String str=s.nextLine();
		int i=0;
		int l=str.length();
		for(i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				continue;
			}
			System.out.print(c);
		}
		
		//String st=str.replaceAll("[aeiouAEIOU]","*");
		//System.out.print(st);

	}

}
