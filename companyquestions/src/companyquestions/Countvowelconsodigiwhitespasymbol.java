package companyquestions;

import java.util.Scanner;

public class Countvowelconsodigiwhitespasymbol {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String");	
		String st=s.nextLine();
		char c=0;
		int consonant=0,vowel=0,digit=0,space=0,symbol=0;
		for(int i=0;i<st.length();i++)
		{
			c=st.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='U'||c=='A'||c=='E'||c=='I'||c=='O') {
		      vowel++;}
			else if((c>='a'&& c<='z') || (c>='A'&& c<='Z')) {
				consonant++;}
			else if(c>='0' && c<='9') {
				digit++;
			}
			else if(c==' ')
			{
				space++;
			}
			else
			{
				symbol++;
			}
			
		}	
			
			System.out.println("Vowel ="+vowel);
			System.out.println("Consonant ="+consonant);
			System.out.println("Space ="+space);
			System.out.println("Digit ="+digit);
			System.out.println("Symbol ="+symbol);
			
			
				

	}

}
