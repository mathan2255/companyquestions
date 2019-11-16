package companyquestions;

import java.util.Scanner;

public class ReplaceMultipleConsecutiveoccurrence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String\n");	
		String st=s.nextLine();
		int l=st.length();
		char c[]=st.toCharArray();
		char temp=c[0];
		StringBuilder sb=new StringBuilder(l);	
		for(int i=0;i<l;i++)
		{
			char ch=c[i];
			if(ch!=temp) {
				sb.append(temp);
				temp=ch;
			}}
			sb.append(temp);
			
		st=sb.toString();
		
		
		System.out.print(st);	
		
	}

}