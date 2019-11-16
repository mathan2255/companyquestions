package companyquestions;

import java.util.Scanner;

public class Vowelorconsonant{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter character");	
		String st=s.next();
		char c=0;
		for(int i=0;i<st.length();i++)
		{
			c=st.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='U'||c=='A'||c=='E'||c=='I'||c=='O')
			System.out.print(c+" is Vowel");
			else
				System.out.print(c+" is Consonant");	
			}
				

	}

}
