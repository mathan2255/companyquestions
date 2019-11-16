package companyquestions;

import java.util.Scanner;

public class Countthevowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String");	
		String st=s.nextLine();
		char c=0;
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			c=st.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='U'||c=='A'||c=='E'||c=='I'||c=='O')
		      count++;
			
		}	
			
			System.out.print(count);	
			
				

	}

}
