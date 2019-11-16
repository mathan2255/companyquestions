package companyquestions;

import java.util.Scanner;

public class Stringtransformation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String temp="";
		int i=0,l=st.length();
		for(i=0;i<l;i++)
		{
			char ch=st.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				ch=(char)(65+(int)(ch-'a'));
			}
			else if(ch>='A'&&ch<='Z')
			{
				ch=(char)(97+(int)(ch-'A'));
			}
			temp+=ch;
			
		}
System.out.println(temp);
	}

}
