package companyquestions;

import java.util.Scanner;

public class Reversething {

	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String a="";
		String rev="";
		String st1[]=st.split(" ");
		for(int i=0;i<st1.length;i++) {
		//System.out.println(st1[i]);
		//System.out.println(st1.length);
		}
		for(int i=1;i<st1.length;i++)
		{
			if(i%2!=0)
			{
				 a=st1[i];
			
			
			for(int j=a.length()-1;j>=0;j--) {
				rev=rev+a.charAt(j);}
			
			System.out.print(rev+"\t");
			}
			else
			
				System.out.print(st1[i]);}
			
			
			}
		
	}

