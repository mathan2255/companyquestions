package companyquestions;

import java.util.Scanner;

public class Missingalphabet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		boolean f=false;
		st=st.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			f=false;
		
		for(int i=0;i<st.length();i++)
		{
			if((st.charAt(i)==ch))
					{
				f=true;
				break;
					}
		}
			
		if(f==false) {
			System.out.print(ch);
			//break;
			
		}
		}	
	}
}